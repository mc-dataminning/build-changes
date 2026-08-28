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

public class adh {
   private static final yy<ByteBuf, Map<ehd.a, long[]>> a = yw.a($$0 -> new EnumMap<>(ehd.a.class), ehd.a.h, yw.o);
   private static final int b = 2097152;
   private final Map<ehd.a, long[]> c;
   private final byte[] d;
   private final List<adh.a> e;

   public adh(edl $$0) {
      this.c = $$0.e()
         .stream()
         .filter($$0x -> ((ehd.a)$$0x.getKey()).b())
         .collect(Collectors.toMap(Entry::getKey, $$0x -> (long[])((ehd)$$0x.getValue()).a().clone()));
      this.d = new byte[a($$0)];
      a(new vw(this.c()), $$0);
      this.e = Lists.newArrayList();

      for (Entry<iv, dyc> $$1 : $$0.I().entrySet()) {
         this.e.add(adh.a.a($$1.getValue()));
      }
   }

   public adh(wl $$0, int $$1, int $$2) {
      this.c = a.decode($$0);
      int $$3 = $$0.l();
      if ($$3 > 2097152) {
         throw new RuntimeException("Chunk Packet trying to allocate too much memory on read.");
      } else {
         this.d = new byte[$$3];
         $$0.b(this.d);
         this.e = adh.a.b.decode($$0);
      }
   }

   public void a(wl $$0) {
      a.encode($$0, this.c);
      $$0.c(this.d.length);
      $$0.c(this.d);
      adh.a.b.encode($$0, this.e);
   }

   private static int a(edl $$0) {
      int $$1 = 0;

      for (edm $$2 : $$0.d()) {
         $$1 += $$2.j();
      }

      return $$1;
   }

   private ByteBuf c() {
      ByteBuf $$0 = Unpooled.wrappedBuffer(this.d);
      $$0.writerIndex(0);
      return $$0;
   }

   public static void a(vw $$0, edl $$1) {
      for (edm $$2 : $$1.d()) {
         $$2.c($$0);
      }
   }

   public Consumer<adh.b> a(int $$0, int $$1) {
      return $$2 -> this.a($$2, $$0, $$1);
   }

   private void a(adh.b $$0, int $$1, int $$2) {
      int $$3 = 16 * $$1;
      int $$4 = 16 * $$2;
      iv.a $$5 = new iv.a();

      for (adh.a $$6 : this.e) {
         int $$7 = $$3 + jy.b($$6.c >> 4);
         int $$8 = $$4 + jy.b($$6.c);
         $$5.d($$7, $$6.d, $$8);
         $$0.accept($$5, $$6.e, $$6.f);
      }
   }

   public vw a() {
      return new vw(Unpooled.wrappedBuffer(this.d));
   }

   public Map<ehd.a, long[]> b() {
      return this.c;
   }

   static class a {
      public static final yy<wl, adh.a> a = yy.a(adh.a::a, adh.a::new);
      public static final yy<wl, List<adh.a>> b = a.a(yw.a());
      final int c;
      final int d;
      final dye<?> e;
      @Nullable
      final tz f;

      private a(int $$0, int $$1, dye<?> $$2, @Nullable tz $$3) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      private a(wl $$0) {
         this.c = $$0.readByte();
         this.d = $$0.readShort();
         this.e = yw.a(mh.e).decode($$0);
         this.f = $$0.o();
      }

      private void a(wl $$0) {
         $$0.l(this.c);
         $$0.m(this.d);
         yw.a(mh.e).encode($$0, this.e);
         $$0.a(this.f);
      }

      static adh.a a(dyc $$0) {
         tz $$1 = $$0.a($$0.i().J_());
         iv $$2 = $$0.aB_();
         int $$3 = jy.b($$2.u()) << 4 | jy.b($$2.w());
         return new adh.a($$3, $$2.v(), $$0.p(), $$1.j() ? null : $$1);
      }
   }

   @FunctionalInterface
   public interface b {
      void accept(iv var1, dye<?> var2, @Nullable tz var3);
   }
}
