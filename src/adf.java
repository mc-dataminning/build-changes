import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class adf {
   private static final yw<ByteBuf, Map<egs.a, long[]>> a = yu.a($$0 -> new EnumMap<>(egs.a.class), egs.a.h, yu.o);
   private static final int b = 2097152;
   private final Map<egs.a, long[]> c;
   private final byte[] d;
   private final List<adf.a> e;

   public adf(eda $$0) {
      this.c = $$0.e()
         .stream()
         .filter($$0x -> ((egs.a)$$0x.getKey()).b())
         .collect(Collectors.toMap(Entry::getKey, $$0x -> (long[])((egs)$$0x.getValue()).a().clone()));
      this.d = new byte[a($$0)];
      a(new vu(this.c()), $$0);
      this.e = Lists.newArrayList();

      for (Entry<iv, dxr> $$1 : $$0.I().entrySet()) {
         this.e.add(adf.a.a($$1.getValue()));
      }
   }

   public adf(wj $$0, int $$1, int $$2) {
      this.c = a.decode($$0);
      int $$3 = $$0.l();
      if ($$3 > 2097152) {
         throw new RuntimeException("Chunk Packet trying to allocate too much memory on read.");
      } else {
         this.d = new byte[$$3];
         $$0.b(this.d);
         this.e = adf.a.b.decode($$0);
      }
   }

   public void a(wj $$0) {
      a.encode($$0, this.c);
      $$0.c(this.d.length);
      $$0.c(this.d);
      adf.a.b.encode($$0, this.e);
   }

   private static int a(eda $$0) {
      int $$1 = 0;

      for (edb $$2 : $$0.d()) {
         $$1 += $$2.j();
      }

      return $$1;
   }

   private ByteBuf c() {
      ByteBuf $$0 = Unpooled.wrappedBuffer(this.d);
      $$0.writerIndex(0);
      return $$0;
   }

   public static void a(vu $$0, eda $$1) {
      for (edb $$2 : $$1.d()) {
         $$2.c($$0);
      }
   }

   public Consumer<adf.b> a(int $$0, int $$1) {
      return $$2 -> this.a($$2, $$0, $$1);
   }

   private void a(adf.b $$0, int $$1, int $$2) {
      int $$3 = 16 * $$1;
      int $$4 = 16 * $$2;
      iv.a $$5 = new iv.a();

      for (adf.a $$6 : this.e) {
         int $$7 = $$3 + jy.b($$6.c >> 4);
         int $$8 = $$4 + jy.b($$6.c);
         $$5.d($$7, $$6.d, $$8);
         $$0.accept($$5, $$6.e, $$6.f);
      }
   }

   public vu a() {
      return new vu(Unpooled.wrappedBuffer(this.d));
   }

   public Map<egs.a, long[]> b() {
      return this.c;
   }

   static class a {
      public static final yw<wj, adf.a> a = yw.a(adf.a::a, adf.a::new);
      public static final yw<wj, List<adf.a>> b = a.a(yu.a());
      final int c;
      final int d;
      final dxt<?> e;
      @Nullable
      final tz f;

      private a(int $$0, int $$1, dxt<?> $$2, @Nullable tz $$3) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      private a(wj $$0) {
         this.c = $$0.readByte();
         this.d = $$0.readShort();
         this.e = yu.a(mh.e).decode($$0);
         this.f = $$0.o();
      }

      private void a(wj $$0) {
         $$0.l(this.c);
         $$0.m(this.d);
         yu.a(mh.e).encode($$0, this.e);
         $$0.a(this.f);
      }

      static adf.a a(dxr $$0) {
         tz $$1 = $$0.a($$0.i().F_());
         iv $$2 = $$0.ax_();
         int $$3 = jy.b($$2.u()) << 4 | jy.b($$2.w());
         return new adf.a($$3, $$2.v(), $$0.p(), $$1.g() ? null : $$1);
      }
   }

   @FunctionalInterface
   public interface b {
      void accept(iv var1, dxt<?> var2, @Nullable tz var3);
   }
}
