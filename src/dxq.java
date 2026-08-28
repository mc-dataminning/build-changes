import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Stream;

public class dxq extends dua {
   public static final MapCodec<dxq> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ego.a.fieldOf("settings").forGetter(dxq::h)).apply($$0, $$0.stable(dxq::new))
   );
   private final ego d;

   public dxq(ego $$0) {
      super(new ddj($$0.d()), ac.b($$0::a));
      this.d = $$0;
   }

   @Override
   public dub a(jk<eir> $$0, dyj $$1, long $$2) {
      Stream<ji<eir>> $$3 = this.d.c().map(jm::a).orElseGet(() -> $$0.b().map($$0xx -> $$0xx));
      return dub.a($$1, $$2, this.b, $$3);
   }

   @Override
   protected MapCodec<? extends dua> b() {
      return c;
   }

   public ego h() {
      return this.d;
   }

   @Override
   public void a(arm $$0, dcs $$1, dyj $$2, dtz $$3) {
   }

   @Override
   public int a(dcb $$0) {
      return $$0.I_() + Math.min($$0.J_(), this.d.f().size());
   }

   @Override
   public CompletableFuture<dtz> a(Executor $$0, dyx $$1, dyj $$2, dcs $$3, dtz $$4) {
      List<dsd> $$5 = this.d.f();
      iz.a $$6 = new iz.a();
      dxv $$7 = $$4.a(dxv.a.c);
      dxv $$8 = $$4.a(dxv.a.a);

      for (int $$9 = 0; $$9 < Math.min($$4.J_(), $$5.size()); $$9++) {
         dsd $$10 = $$5.get($$9);
         if ($$10 != null) {
            int $$11 = $$4.I_() + $$9;

            for (int $$12 = 0; $$12 < 16; $$12++) {
               for (int $$13 = 0; $$13 < 16; $$13++) {
                  $$4.a($$6.d($$12, $$11, $$13), $$10, false);
                  $$7.a($$12, $$11, $$13, $$10);
                  $$8.a($$12, $$11, $$13, $$10);
               }
            }
         }
      }

      return CompletableFuture.completedFuture($$4);
   }

   @Override
   public int a(int $$0, int $$1, dxv.a $$2, dcb $$3, dyj $$4) {
      List<dsd> $$5 = this.d.f();

      for (int $$6 = Math.min($$5.size(), $$3.am()) - 1; $$6 >= 0; $$6--) {
         dsd $$7 = $$5.get($$6);
         if ($$7 != null && $$2.e().test($$7)) {
            return $$3.I_() + $$6 + 1;
         }
      }

      return $$3.I_();
   }

   @Override
   public dcl a(int $$0, int $$1, dcb $$2, dyj $$3) {
      return new dcl($$2.I_(), this.d.f().stream().limit((long)$$2.J_()).map($$0x -> $$0x == null ? dfc.a.o() : $$0x).toArray(dsd[]::new));
   }

   @Override
   public void a(List<String> $$0, dyj $$1, iz $$2) {
   }

   @Override
   public void a(arm $$0, long $$1, dyj $$2, dda $$3, dcs $$4, dtz $$5, dxr.a $$6) {
   }

   @Override
   public void a(arm $$0) {
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
