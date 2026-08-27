import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Stream;

public class dok extends dld {
   public static final Codec<dok> c = RecordCodecBuilder.create($$0 -> $$0.group(dxi.a.fieldOf("settings").forGetter(dok::g)).apply($$0, $$0.stable(dok::new)));
   private final dxi d;

   public dok(dxi $$0) {
      super(new cuy($$0.d()), ac.b($$0::a));
      this.d = $$0;
   }

   @Override
   public dle a(ij<dzl> $$0, dpd $$1, long $$2) {
      Stream<ih<dzl>> $$3 = this.d.c().map(il::a).orElseGet(() -> $$0.b().map($$0xx -> $$0xx));
      return dle.a($$1, $$2, this.b, $$3);
   }

   @Override
   protected Codec<? extends dld> a() {
      return c;
   }

   public dxi g() {
      return this.d;
   }

   @Override
   public void a(ank $$0, cuh $$1, dpd $$2, dlc $$3) {
   }

   @Override
   public int a(ctq $$0) {
      return $$0.J_() + Math.min($$0.K_(), this.d.f().size());
   }

   @Override
   public CompletableFuture<dlc> a(Executor $$0, dpr $$1, dpd $$2, cuh $$3, dlc $$4) {
      List<djg> $$5 = this.d.f();
      hx.a $$6 = new hx.a();
      dop $$7 = $$4.a(dop.a.c);
      dop $$8 = $$4.a(dop.a.a);

      for (int $$9 = 0; $$9 < Math.min($$4.K_(), $$5.size()); $$9++) {
         djg $$10 = $$5.get($$9);
         if ($$10 != null) {
            int $$11 = $$4.J_() + $$9;

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
   public int a(int $$0, int $$1, dop.a $$2, ctq $$3, dpd $$4) {
      List<djg> $$5 = this.d.f();

      for (int $$6 = Math.min($$5.size(), $$3.al()) - 1; $$6 >= 0; $$6--) {
         djg $$7 = $$5.get($$6);
         if ($$7 != null && $$2.e().test($$7)) {
            return $$3.J_() + $$6 + 1;
         }
      }

      return $$3.J_();
   }

   @Override
   public cua a(int $$0, int $$1, ctq $$2, dpd $$3) {
      return new cua($$2.J_(), this.d.f().stream().limit((long)$$2.K_()).map($$0x -> $$0x == null ? cwr.a.o() : $$0x).toArray(djg[]::new));
   }

   @Override
   public void a(List<String> $$0, dpd $$1, hx $$2) {
   }

   @Override
   public void a(ank $$0, long $$1, dpd $$2, cup $$3, cuh $$4, dlc $$5, dol.a $$6) {
   }

   @Override
   public void a(ank $$0) {
   }

   @Override
   public int f() {
      return 0;
   }

   @Override
   public int d() {
      return 384;
   }

   @Override
   public int e() {
      return -63;
   }
}
