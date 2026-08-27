import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Stream;

public class dol extends dle {
   public static final Codec<dol> c = RecordCodecBuilder.create($$0 -> $$0.group(dxj.a.fieldOf("settings").forGetter(dol::g)).apply($$0, $$0.stable(dol::new)));
   private final dxj d;

   public dol(dxj $$0) {
      super(new cuz($$0.d()), ac.b($$0::a));
      this.d = $$0;
   }

   @Override
   public dlf a(ij<dzm> $$0, dpe $$1, long $$2) {
      Stream<ih<dzm>> $$3 = this.d.c().map(il::a).orElseGet(() -> $$0.b().map($$0xx -> $$0xx));
      return dlf.a($$1, $$2, this.b, $$3);
   }

   @Override
   protected Codec<? extends dle> a() {
      return c;
   }

   public dxj g() {
      return this.d;
   }

   @Override
   public void a(ank $$0, cui $$1, dpe $$2, dld $$3) {
   }

   @Override
   public int a(ctr $$0) {
      return $$0.J_() + Math.min($$0.K_(), this.d.f().size());
   }

   @Override
   public CompletableFuture<dld> a(Executor $$0, dps $$1, dpe $$2, cui $$3, dld $$4) {
      List<djh> $$5 = this.d.f();
      hx.a $$6 = new hx.a();
      doq $$7 = $$4.a(doq.a.c);
      doq $$8 = $$4.a(doq.a.a);

      for (int $$9 = 0; $$9 < Math.min($$4.K_(), $$5.size()); $$9++) {
         djh $$10 = $$5.get($$9);
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
   public int a(int $$0, int $$1, doq.a $$2, ctr $$3, dpe $$4) {
      List<djh> $$5 = this.d.f();

      for (int $$6 = Math.min($$5.size(), $$3.al()) - 1; $$6 >= 0; $$6--) {
         djh $$7 = $$5.get($$6);
         if ($$7 != null && $$2.e().test($$7)) {
            return $$3.J_() + $$6 + 1;
         }
      }

      return $$3.J_();
   }

   @Override
   public cub a(int $$0, int $$1, ctr $$2, dpe $$3) {
      return new cub($$2.J_(), this.d.f().stream().limit((long)$$2.K_()).map($$0x -> $$0x == null ? cws.a.o() : $$0x).toArray(djh[]::new));
   }

   @Override
   public void a(List<String> $$0, dpe $$1, hx $$2) {
   }

   @Override
   public void a(ank $$0, long $$1, dpe $$2, cuq $$3, cui $$4, dld $$5, dom.a $$6) {
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
