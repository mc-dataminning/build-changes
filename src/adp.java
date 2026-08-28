import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class adp {
   private static final int a = 2097152;
   private final ur b;
   private final byte[] c;
   private final List<adp.a> d;

   public adp(dud $$0) {
      this.b = new ur();

      for (Entry<dxp.a, dxp> $$1 : $$0.e()) {
         if ($$1.getKey().b()) {
            this.b.a($$1.getKey().a(), new uy($$1.getValue().a()));
         }
      }

      this.c = new byte[a($$0)];
      a(new wl(this.c()), $$0);
      this.d = Lists.newArrayList();

      for (Entry<iz, dpc> $$2 : $$0.G().entrySet()) {
         this.d.add(adp.a.a($$2.getValue()));
      }
   }

   public adp(ww $$0, int $$1, int $$2) {
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
            this.d = adp.a.b.decode($$0);
         }
      }
   }

   public void a(ww $$0) {
      $$0.a(this.b);
      $$0.c(this.c.length);
      $$0.c(this.c);
      adp.a.b.encode($$0, this.d);
   }

   private static int a(dud $$0) {
      int $$1 = 0;

      for (due $$2 : $$0.d()) {
         $$1 += $$2.j();
      }

      return $$1;
   }

   private ByteBuf c() {
      ByteBuf $$0 = Unpooled.wrappedBuffer(this.c);
      $$0.writerIndex(0);
      return $$0;
   }

   public static void a(wl $$0, dud $$1) {
      for (due $$2 : $$1.d()) {
         $$2.c($$0);
      }
   }

   public Consumer<adp.b> a(int $$0, int $$1) {
      return $$2 -> this.a($$2, $$0, $$1);
   }

   private void a(adp.b $$0, int $$1, int $$2) {
      int $$3 = 16 * $$1;
      int $$4 = 16 * $$2;
      iz.a $$5 = new iz.a();

      for (adp.a $$6 : this.d) {
         int $$7 = $$3 + kb.b($$6.c >> 4);
         int $$8 = $$4 + kb.b($$6.c);
         $$5.d($$7, $$6.d, $$8);
         $$0.accept($$5, $$6.e, $$6.f);
      }
   }

   public wl a() {
      return new wl(Unpooled.wrappedBuffer(this.c));
   }

   public ur b() {
      return this.b;
   }

   static class a {
      public static final zj<ww, adp.a> a = zj.a(adp.a::a, adp.a::new);
      public static final zj<ww, List<adp.a>> b = a.a(zh.a());
      final int c;
      final int d;
      final dpe<?> e;
      @Nullable
      final ur f;

      private a(int $$0, int $$1, dpe<?> $$2, @Nullable ur $$3) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      private a(ww $$0) {
         this.c = $$0.readByte();
         this.d = $$0.readShort();
         this.e = zh.a(lq.h).decode($$0);
         this.f = $$0.o();
      }

      private void a(ww $$0) {
         $$0.k(this.c);
         $$0.l(this.d);
         zh.a(lq.h).encode($$0, this.e);
         $$0.a(this.f);
      }

      static adp.a a(dpc $$0) {
         ur $$1 = $$0.a($$0.i().H_());
         iz $$2 = $$0.aA_();
         int $$3 = kb.b($$2.u()) << 4 | kb.b($$2.w());
         return new adp.a($$3, $$2.v(), $$0.r(), $$1.g() ? null : $$1);
      }
   }

   @FunctionalInterface
   public interface b {
      void accept(iz var1, dpe<?> var2, @Nullable ur var3);
   }
}
