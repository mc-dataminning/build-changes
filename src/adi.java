import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class adi {
   private static final int a = 2097152;
   private final uk b;
   private final byte[] c;
   private final List<adi.a> d;

   public adi(dvi $$0) {
      this.b = new uk();

      for (Entry<dyu.a, dyu> $$1 : $$0.f()) {
         if ($$1.getKey().b()) {
            this.b.a($$1.getKey().a(), new ur($$1.getValue().a()));
         }
      }

      this.c = new byte[a($$0)];
      a(new we(this.c()), $$0);
      this.d = Lists.newArrayList();

      for (Entry<ir, dqc> $$2 : $$0.H().entrySet()) {
         this.d.add(adi.a.a($$2.getValue()));
      }
   }

   public adi(wp $$0, int $$1, int $$2) {
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
            this.d = adi.a.b.decode($$0);
         }
      }
   }

   public void a(wp $$0) {
      $$0.a(this.b);
      $$0.c(this.c.length);
      $$0.c(this.c);
      adi.a.b.encode($$0, this.d);
   }

   private static int a(dvi $$0) {
      int $$1 = 0;

      for (dvj $$2 : $$0.e()) {
         $$1 += $$2.j();
      }

      return $$1;
   }

   private ByteBuf c() {
      ByteBuf $$0 = Unpooled.wrappedBuffer(this.c);
      $$0.writerIndex(0);
      return $$0;
   }

   public static void a(we $$0, dvi $$1) {
      for (dvj $$2 : $$1.e()) {
         $$2.c($$0);
      }
   }

   public Consumer<adi.b> a(int $$0, int $$1) {
      return $$2 -> this.a($$2, $$0, $$1);
   }

   private void a(adi.b $$0, int $$1, int $$2) {
      int $$3 = 16 * $$1;
      int $$4 = 16 * $$2;
      ir.a $$5 = new ir.a();

      for (adi.a $$6 : this.d) {
         int $$7 = $$3 + jt.b($$6.c >> 4);
         int $$8 = $$4 + jt.b($$6.c);
         $$5.d($$7, $$6.d, $$8);
         $$0.accept($$5, $$6.e, $$6.f);
      }
   }

   public we a() {
      return new we(Unpooled.wrappedBuffer(this.c));
   }

   public uk b() {
      return this.b;
   }

   static class a {
      public static final zc<wp, adi.a> a = zc.a(adi.a::a, adi.a::new);
      public static final zc<wp, List<adi.a>> b = a.a(za.a());
      final int c;
      final int d;
      final dqe<?> e;
      @Nullable
      final uk f;

      private a(int $$0, int $$1, dqe<?> $$2, @Nullable uk $$3) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      private a(wp $$0) {
         this.c = $$0.readByte();
         this.d = $$0.readShort();
         this.e = za.a(li.h).decode($$0);
         this.f = $$0.o();
      }

      private void a(wp $$0) {
         $$0.k(this.c);
         $$0.l(this.d);
         za.a(li.h).encode($$0, this.e);
         $$0.a(this.f);
      }

      static adi.a a(dqc $$0) {
         uk $$1 = $$0.a($$0.i().I_());
         ir $$2 = $$0.az_();
         int $$3 = jt.b($$2.u()) << 4 | jt.b($$2.w());
         return new adi.a($$3, $$2.v(), $$0.r(), $$1.g() ? null : $$1);
      }
   }

   @FunctionalInterface
   public interface b {
      void accept(ir var1, dqe<?> var2, @Nullable uk var3);
   }
}
