import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class ade {
   private static final int a = 2097152;
   private final ua b;
   private final byte[] c;
   private final List<ade.a> d;

   public ade(dvg $$0) {
      this.b = new ua();

      for (Entry<dyv.a, dyv> $$1 : $$0.e()) {
         if ($$1.getKey().b()) {
            this.b.a($$1.getKey().a(), new uh($$1.getValue().a()));
         }
      }

      this.c = new byte[a($$0)];
      a(new vv(this.c()), $$0);
      this.d = Lists.newArrayList();

      for (Entry<jd, dqf> $$2 : $$0.G().entrySet()) {
         this.d.add(ade.a.a($$2.getValue()));
      }
   }

   public ade(wj $$0, int $$1, int $$2) {
      this.b = $$0.o();
      if (this.b == null) {
         throw new RuntimeException("Can't read heightmap in packet for [" + $$1 + ", " + $$2 + "]");
      } else {
         int $$3 = $$0.l();
         if ($$3 > 2097152) {
            throw new RuntimeException("Chunk Packet trying to allocate too much memory on read.");
         } else {
            this.c = new byte[$$3];
            $$0.b(this.c);
            this.d = ade.a.b.decode($$0);
         }
      }
   }

   public void a(wj $$0) {
      $$0.a(this.b);
      $$0.c(this.c.length);
      $$0.c(this.c);
      ade.a.b.encode($$0, this.d);
   }

   private static int a(dvg $$0) {
      int $$1 = 0;

      for (dvh $$2 : $$0.d()) {
         $$1 += $$2.j();
      }

      return $$1;
   }

   private ByteBuf c() {
      ByteBuf $$0 = Unpooled.wrappedBuffer(this.c);
      $$0.writerIndex(0);
      return $$0;
   }

   public static void a(vv $$0, dvg $$1) {
      for (dvh $$2 : $$1.d()) {
         $$2.c($$0);
      }
   }

   public Consumer<ade.b> a(int $$0, int $$1) {
      return $$2 -> this.a($$2, $$0, $$1);
   }

   private void a(ade.b $$0, int $$1, int $$2) {
      int $$3 = 16 * $$1;
      int $$4 = 16 * $$2;
      jd.a $$5 = new jd.a();

      for (ade.a $$6 : this.d) {
         int $$7 = $$3 + kf.b($$6.c >> 4);
         int $$8 = $$4 + kf.b($$6.c);
         $$5.d($$7, $$6.d, $$8);
         $$0.accept($$5, $$6.e, $$6.f);
      }
   }

   public vv a() {
      return new vv(Unpooled.wrappedBuffer(this.c));
   }

   public ua b() {
      return this.b;
   }

   static class a {
      public static final yw<wj, ade.a> a = yw.a(ade.a::a, ade.a::new);
      public static final yw<wj, List<ade.a>> b = a.a(yu.a());
      final int c;
      final int d;
      final dqh<?> e;
      @Nullable
      final ua f;

      private a(int $$0, int $$1, dqh<?> $$2, @Nullable ua $$3) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      private a(wj $$0) {
         this.c = $$0.readByte();
         this.d = $$0.readShort();
         this.e = yu.a(lu.h).decode($$0);
         this.f = $$0.o();
      }

      private void a(wj $$0) {
         $$0.k(this.c);
         $$0.l(this.d);
         yu.a(lu.h).encode($$0, this.e);
         $$0.a(this.f);
      }

      static ade.a a(dqf $$0) {
         ua $$1 = $$0.a($$0.i().H_());
         jd $$2 = $$0.az_();
         int $$3 = kf.b($$2.u()) << 4 | kf.b($$2.w());
         return new ade.a($$3, $$2.v(), $$0.r(), $$1.g() ? null : $$1);
      }
   }

   @FunctionalInterface
   public interface b {
      void accept(jd var1, dqh<?> var2, @Nullable ua var3);
   }
}
