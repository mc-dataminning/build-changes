import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Stream;

public class dkn extends dhg {
   public static final Codec<dkn> c = RecordCodecBuilder.create($$0 -> $$0.group(dtl.a.fieldOf("settings").forGetter(dkn::g)).apply($$0, $$0.stable(dkn::new)));
   private final dtl d;

   public dkn(dtl $$0) {
      super(new cre($$0.d()), ac.b($$0::a));
      this.d = $$0;
   }

   @Override
   public dhh a(hi<dvo> $$0, dlg $$1, long $$2) {
      Stream<hg<dvo>> $$3 = this.d.c().map(hk::a).orElseGet(() -> $$0.b().map($$0xx -> $$0xx));
      return dhh.a($$1, $$2, this.b, $$3);
   }

   @Override
   protected Codec<? extends dhg> a() {
      return c;
   }

   public dtl g() {
      return this.d;
   }

   @Override
   public void a(aky $$0, cqn $$1, dlg $$2, dhf $$3) {
   }

   @Override
   public int a(cpx $$0) {
      return $$0.H_() + Math.min($$0.I_(), this.d.f().size());
   }

   @Override
   public CompletableFuture<dhf> a(Executor $$0, dlu $$1, dlg $$2, cqn $$3, dhf $$4) {
      List<dfj> $$5 = this.d.f();
      gw.a $$6 = new gw.a();
      dks $$7 = $$4.a(dks.a.c);
      dks $$8 = $$4.a(dks.a.a);

      for (int $$9 = 0; $$9 < Math.min($$4.I_(), $$5.size()); $$9++) {
         dfj $$10 = $$5.get($$9);
         if ($$10 != null) {
            int $$11 = $$4.H_() + $$9;

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
   public int a(int $$0, int $$1, dks.a $$2, cpx $$3, dlg $$4) {
      List<dfj> $$5 = this.d.f();

      for (int $$6 = Math.min($$5.size(), $$3.aj()) - 1; $$6 >= 0; $$6--) {
         dfj $$7 = $$5.get($$6);
         if ($$7 != null && $$2.e().test($$7)) {
            return $$3.H_() + $$6 + 1;
         }
      }

      return $$3.H_();
   }

   @Override
   public cqh a(int $$0, int $$1, cpx $$2, dlg $$3) {
      return new cqh($$2.H_(), this.d.f().stream().limit((long)$$2.I_()).map($$0x -> $$0x == null ? csw.a.n() : $$0x).toArray(dfj[]::new));
   }

   @Override
   public void a(List<String> $$0, dlg $$1, gw $$2) {
   }

   @Override
   public void a(aky $$0, long $$1, dlg $$2, cqv $$3, cqn $$4, dhf $$5, dko.a $$6) {
   }

   @Override
   public void a(aky $$0) {
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
