import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class edl extends dzr {
   public static final MapCodec<edl> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(emn.a.fieldOf("settings").forGetter(edl::h)).apply($$0, $$0.stable(edl::new))
   );
   private final emn d;

   public edl(emn $$0) {
      super(new div($$0.d()), ae.b($$0::a));
      this.d = $$0;
   }

   @Override
   public dzs a(js<eoq> $$0, eee $$1, long $$2) {
      Stream<jq<eoq>> $$3 = this.d.c().map(ju::a).orElseGet(() -> $$0.c().map($$0xx -> $$0xx));
      return dzs.a($$1, $$2, this.b, $$3);
   }

   @Override
   protected MapCodec<? extends dzr> b() {
      return c;
   }

   public emn h() {
      return this.d;
   }

   @Override
   public void a(asp $$0, die $$1, eee $$2, dzq $$3) {
   }

   @Override
   public int a(dhk $$0) {
      return $$0.L_() + Math.min($$0.M_(), this.d.f().size());
   }

   @Override
   public CompletableFuture<dzq> a(ees $$0, eee $$1, die $$2, dzq $$3) {
      List<dxv> $$4 = this.d.f();
      jh.a $$5 = new jh.a();
      edq $$6 = $$3.a(edq.a.c);
      edq $$7 = $$3.a(edq.a.a);

      for (int $$8 = 0; $$8 < Math.min($$3.M_(), $$4.size()); $$8++) {
         dxv $$9 = $$4.get($$8);
         if ($$9 != null) {
            int $$10 = $$3.L_() + $$8;

            for (int $$11 = 0; $$11 < 16; $$11++) {
               for (int $$12 = 0; $$12 < 16; $$12++) {
                  $$3.a($$5.d($$11, $$10, $$12), $$9, false);
                  $$6.a($$11, $$10, $$12, $$9);
                  $$7.a($$11, $$10, $$12, $$9);
               }
            }
         }
      }

      return CompletableFuture.completedFuture($$3);
   }

   @Override
   public int a(int $$0, int $$1, edq.a $$2, dhk $$3, eee $$4) {
      List<dxv> $$5 = this.d.f();

      for (int $$6 = Math.min($$5.size() - 1, $$3.am()); $$6 >= 0; $$6--) {
         dxv $$7 = $$5.get($$6);
         if ($$7 != null && $$2.e().test($$7)) {
            return $$3.L_() + $$6 + 1;
         }
      }

      return $$3.L_();
   }

   @Override
   public dhu a(int $$0, int $$1, dhk $$2, eee $$3) {
      return new dhu($$2.L_(), this.d.f().stream().limit((long)$$2.M_()).map($$0x -> $$0x == null ? dko.a.m() : $$0x).toArray(dxv[]::new));
   }

   @Override
   public void a(List<String> $$0, eee $$1, jh $$2) {
   }

   @Override
   public void a(asp $$0, long $$1, eee $$2, dim $$3, die $$4, dzq $$5) {
   }

   @Override
   public void a(asp $$0) {
   }

   @Override
   public int g() {
      return 0;
   }

   @Override
   public int e() {
      return 384;
   }

   @Override
   public int f() {
      return -63;
   }
}
