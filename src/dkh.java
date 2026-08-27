import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Stream;

public class dkh extends dha {
   public static final Codec<dkh> c = RecordCodecBuilder.create($$0 -> $$0.group(dtf.a.fieldOf("settings").forGetter(dkh::g)).apply($$0, $$0.stable(dkh::new)));
   private final dtf d;

   public dkh(dtf $$0) {
      super(new crk($$0.d()), ac.b($$0::a));
      this.d = $$0;
   }

   @Override
   public dhb a(hg<dvi> $$0, dla $$1, long $$2) {
      Stream<he<dvi>> $$3 = this.d.c().map(hi::a).orElseGet(() -> $$0.b().map($$0xx -> $$0xx));
      return dhb.a($$1, $$2, this.b, $$3);
   }

   @Override
   protected Codec<? extends dha> a() {
      return c;
   }

   public dtf g() {
      return this.d;
   }

   @Override
   public void a(ala $$0, cqt $$1, dla $$2, dgz $$3) {
   }

   @Override
   public int a(cqd $$0) {
      return $$0.H_() + Math.min($$0.I_(), this.d.f().size());
   }

   @Override
   public CompletableFuture<dgz> a(Executor $$0, dlo $$1, dla $$2, cqt $$3, dgz $$4) {
      List<dfd> $$5 = this.d.f();
      gw.a $$6 = new gw.a();
      dkm $$7 = $$4.a(dkm.a.c);
      dkm $$8 = $$4.a(dkm.a.a);

      for (int $$9 = 0; $$9 < Math.min($$4.I_(), $$5.size()); $$9++) {
         dfd $$10 = $$5.get($$9);
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
   public int a(int $$0, int $$1, dkm.a $$2, cqd $$3, dla $$4) {
      List<dfd> $$5 = this.d.f();

      for (int $$6 = Math.min($$5.size(), $$3.aj()) - 1; $$6 >= 0; $$6--) {
         dfd $$7 = $$5.get($$6);
         if ($$7 != null && $$2.e().test($$7)) {
            return $$3.H_() + $$6 + 1;
         }
      }

      return $$3.H_();
   }

   @Override
   public cqn a(int $$0, int $$1, cqd $$2, dla $$3) {
      return new cqn($$2.H_(), this.d.f().stream().limit((long)$$2.I_()).map($$0x -> $$0x == null ? cte.a.o() : $$0x).toArray(dfd[]::new));
   }

   @Override
   public void a(List<String> $$0, dla $$1, gw $$2) {
   }

   @Override
   public void a(ala $$0, long $$1, dla $$2, crb $$3, cqt $$4, dgz $$5, dki.a $$6) {
   }

   @Override
   public void a(ala $$0) {
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
