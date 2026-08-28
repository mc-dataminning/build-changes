import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class egn extends ecr {
   public static final MapCodec<egn> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(epq.a.fieldOf("settings").forGetter(egn::h)).apply($$0, $$0.stable(egn::new))
   );
   private final epq d;

   public egn(epq $$0) {
      super(new dla($$0.d()), ag.b($$0::a));
      this.d = $$0;
   }

   @Override
   public ecs a(jh<ert> $$0, ehg $$1, long $$2) {
      Stream<jf<ert>> $$3 = this.d.c().map(jj::a).orElseGet(() -> $$0.c().map($$0xx -> $$0xx));
      return ecs.a($$1, $$2, this.b, $$3);
   }

   @Override
   protected MapCodec<? extends ecr> b() {
      return c;
   }

   public epq h() {
      return this.d;
   }

   @Override
   public void a(ary $$0, dki $$1, ehg $$2, ecq $$3) {
   }

   @Override
   public int a(djo $$0) {
      return $$0.G_() + Math.min($$0.H_(), this.d.f().size());
   }

   @Override
   public CompletableFuture<ecq> a(ehu $$0, ehg $$1, dki $$2, ecq $$3) {
      List<eat> $$4 = this.d.f();
      iv.a $$5 = new iv.a();
      egs $$6 = $$3.a(egs.a.c);
      egs $$7 = $$3.a(egs.a.a);

      for (int $$8 = 0; $$8 < Math.min($$3.H_(), $$4.size()); $$8++) {
         eat $$9 = $$4.get($$8);
         if ($$9 != null) {
            int $$10 = $$3.G_() + $$8;

            for (int $$11 = 0; $$11 < 16; $$11++) {
               for (int $$12 = 0; $$12 < 16; $$12++) {
                  $$3.a($$5.d($$11, $$10, $$12), $$9);
                  $$6.a($$11, $$10, $$12, $$9);
                  $$7.a($$11, $$10, $$12, $$9);
               }
            }
         }
      }

      return CompletableFuture.completedFuture($$3);
   }

   @Override
   public int a(int $$0, int $$1, egs.a $$2, djo $$3, ehg $$4) {
      List<eat> $$5 = this.d.f();

      for (int $$6 = Math.min($$5.size() - 1, $$3.ao()); $$6 >= 0; $$6--) {
         eat $$7 = $$5.get($$6);
         if ($$7 != null && $$2.e().test($$7)) {
            return $$3.G_() + $$6 + 1;
         }
      }

      return $$3.G_();
   }

   @Override
   public djy a(int $$0, int $$1, djo $$2, ehg $$3) {
      return new djy($$2.G_(), this.d.f().stream().limit((long)$$2.H_()).map($$0x -> $$0x == null ? dmt.a.m() : $$0x).toArray(eat[]::new));
   }

   @Override
   public void a(List<String> $$0, ehg $$1, iv $$2) {
   }

   @Override
   public void a(ary $$0, long $$1, ehg $$2, dkr $$3, dki $$4, ecq $$5) {
   }

   @Override
   public void a(ary $$0) {
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
