import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class acw {
   private static final int a = 2097152;
   private final tq b;
   private final byte[] c;
   private final List<acw.a> d;

   public acw(dzc $$0) {
      this.b = new tq();

      for (Entry<ecs.a, ecs> $$1 : $$0.e()) {
         if ($$1.getKey().b()) {
            this.b.a($$1.getKey().a(), new tx($$1.getValue().a()));
         }
      }

      this.c = new byte[a($$0)];
      a(new vl(this.c()), $$0);
      this.d = Lists.newArrayList();

      for (Entry<ji, dtz> $$2 : $$0.I().entrySet()) {
         this.d.add(acw.a.a($$2.getValue()));
      }
   }

   public acw(vz $$0, int $$1, int $$2) {
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
            this.d = acw.a.b.decode($$0);
         }
      }
   }

   public void a(vz $$0) {
      $$0.a(this.b);
      $$0.c(this.c.length);
      $$0.c(this.c);
      acw.a.b.encode($$0, this.d);
   }

   private static int a(dzc $$0) {
      int $$1 = 0;

      for (dzd $$2 : $$0.d()) {
         $$1 += $$2.j();
      }

      return $$1;
   }

   private ByteBuf c() {
      ByteBuf $$0 = Unpooled.wrappedBuffer(this.c);
      $$0.writerIndex(0);
      return $$0;
   }

   public static void a(vl $$0, dzc $$1) {
      for (dzd $$2 : $$1.d()) {
         $$2.c($$0);
      }
   }

   public Consumer<acw.b> a(int $$0, int $$1) {
      return $$2 -> this.a($$2, $$0, $$1);
   }

   private void a(acw.b $$0, int $$1, int $$2) {
      int $$3 = 16 * $$1;
      int $$4 = 16 * $$2;
      ji.a $$5 = new ji.a();

      for (acw.a $$6 : this.d) {
         int $$7 = $$3 + kk.b($$6.c >> 4);
         int $$8 = $$4 + kk.b($$6.c);
         $$5.d($$7, $$6.d, $$8);
         $$0.accept($$5, $$6.e, $$6.f);
      }
   }

   public vl a() {
      return new vl(Unpooled.wrappedBuffer(this.c));
   }

   public tq b() {
      return this.b;
   }

   static class a {
      public static final ym<vz, acw.a> a = ym.a(acw.a::a, acw.a::new);
      public static final ym<vz, List<acw.a>> b = a.a(yk.a());
      final int c;
      final int d;
      final dub<?> e;
      @Nullable
      final tq f;

      private a(int $$0, int $$1, dub<?> $$2, @Nullable tq $$3) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      private a(vz $$0) {
         this.c = $$0.readByte();
         this.d = $$0.readShort();
         this.e = yk.a(mc.h).decode($$0);
         this.f = $$0.o();
      }

      private void a(vz $$0) {
         $$0.l(this.c);
         $$0.m(this.d);
         yk.a(mc.h).encode($$0, this.e);
         $$0.a(this.f);
      }

      static acw.a a(dtz $$0) {
         tq $$1 = $$0.a($$0.i().K_());
         ji $$2 = $$0.aA_();
         int $$3 = kk.b($$2.u()) << 4 | kk.b($$2.w());
         return new acw.a($$3, $$2.v(), $$0.p(), $$1.g() ? null : $$1);
      }
   }

   @FunctionalInterface
   public interface b {
      void accept(ji var1, dub<?> var2, @Nullable tq var3);
   }
}
