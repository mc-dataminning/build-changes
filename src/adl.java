import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class adl {
   private static final int a = 2097152;
   private final ug b;
   private final byte[] c;
   private final List<adl.a> d;

   public adl(dwy $$0) {
      this.b = new ug();

      for (Entry<eao.a, eao> $$1 : $$0.e()) {
         if ($$1.getKey().b()) {
            this.b.a($$1.getKey().a(), new un($$1.getValue().a()));
         }
      }

      this.c = new byte[a($$0)];
      a(new wb(this.c()), $$0);
      this.d = Lists.newArrayList();

      for (Entry<jf, drv> $$2 : $$0.F().entrySet()) {
         this.d.add(adl.a.a($$2.getValue()));
      }
   }

   public adl(wp $$0, int $$1, int $$2) {
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
            this.d = adl.a.b.decode($$0);
         }
      }
   }

   public void a(wp $$0) {
      $$0.a(this.b);
      $$0.c(this.c.length);
      $$0.c(this.c);
      adl.a.b.encode($$0, this.d);
   }

   private static int a(dwy $$0) {
      int $$1 = 0;

      for (dwz $$2 : $$0.d()) {
         $$1 += $$2.j();
      }

      return $$1;
   }

   private ByteBuf c() {
      ByteBuf $$0 = Unpooled.wrappedBuffer(this.c);
      $$0.writerIndex(0);
      return $$0;
   }

   public static void a(wb $$0, dwy $$1) {
      for (dwz $$2 : $$1.d()) {
         $$2.c($$0);
      }
   }

   public Consumer<adl.b> a(int $$0, int $$1) {
      return $$2 -> this.a($$2, $$0, $$1);
   }

   private void a(adl.b $$0, int $$1, int $$2) {
      int $$3 = 16 * $$1;
      int $$4 = 16 * $$2;
      jf.a $$5 = new jf.a();

      for (adl.a $$6 : this.d) {
         int $$7 = $$3 + kh.b($$6.c >> 4);
         int $$8 = $$4 + kh.b($$6.c);
         $$5.d($$7, $$6.d, $$8);
         $$0.accept($$5, $$6.e, $$6.f);
      }
   }

   public wb a() {
      return new wb(Unpooled.wrappedBuffer(this.c));
   }

   public ug b() {
      return this.b;
   }

   static class a {
      public static final zc<wp, adl.a> a = zc.a(adl.a::a, adl.a::new);
      public static final zc<wp, List<adl.a>> b = a.a(za.a());
      final int c;
      final int d;
      final drx<?> e;
      @Nullable
      final ug f;

      private a(int $$0, int $$1, drx<?> $$2, @Nullable ug $$3) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      private a(wp $$0) {
         this.c = $$0.readByte();
         this.d = $$0.readShort();
         this.e = za.a(lw.h).decode($$0);
         this.f = $$0.o();
      }

      private void a(wp $$0) {
         $$0.l(this.c);
         $$0.m(this.d);
         za.a(lw.h).encode($$0, this.e);
         $$0.a(this.f);
      }

      static adl.a a(drv $$0) {
         ug $$1 = $$0.a($$0.i().G_());
         jf $$2 = $$0.aC_();
         int $$3 = kh.b($$2.u()) << 4 | kh.b($$2.w());
         return new adl.a($$3, $$2.v(), $$0.q(), $$1.g() ? null : $$1);
      }
   }

   @FunctionalInterface
   public interface b {
      void accept(jf var1, drx<?> var2, @Nullable ug var3);
   }
}
