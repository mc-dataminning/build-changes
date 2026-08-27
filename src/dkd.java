import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Stream;

public class dkd extends dgw {
   public static final Codec<dkd> c = RecordCodecBuilder.create($$0 -> $$0.group(dtb.a.fieldOf("settings").forGetter(dkd::g)).apply($$0, $$0.stable(dkd::new)));
   private final dtb d;

   public dkd(dtb $$0) {
      super(new cqu($$0.d()), ac.b($$0::a));
      this.d = $$0;
   }

   @Override
   public dgx a(hg<dve> $$0, dkw $$1, long $$2) {
      Stream<he<dve>> $$3 = this.d.c().map(hi::a).orElseGet(() -> $$0.b().map($$0xx -> $$0xx));
      return dgx.a($$1, $$2, this.b, $$3);
   }

   @Override
   protected Codec<? extends dgw> a() {
      return c;
   }

   public dtb g() {
      return this.d;
   }

   @Override
   public void a(akr $$0, cqd $$1, dkw $$2, dgv $$3) {
   }

   @Override
   public int a(cpn $$0) {
      return $$0.C_() + Math.min($$0.D_(), this.d.f().size());
   }

   @Override
   public CompletableFuture<dgv> a(Executor $$0, dlk $$1, dkw $$2, cqd $$3, dgv $$4) {
      List<dez> $$5 = this.d.f();
      gu.a $$6 = new gu.a();
      dki $$7 = $$4.a(dki.a.c);
      dki $$8 = $$4.a(dki.a.a);

      for (int $$9 = 0; $$9 < Math.min($$4.D_(), $$5.size()); $$9++) {
         dez $$10 = $$5.get($$9);
         if ($$10 != null) {
            int $$11 = $$4.C_() + $$9;

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
   public int a(int $$0, int $$1, dki.a $$2, cpn $$3, dkw $$4) {
      List<dez> $$5 = this.d.f();

      for (int $$6 = Math.min($$5.size(), $$3.aj()) - 1; $$6 >= 0; $$6--) {
         dez $$7 = $$5.get($$6);
         if ($$7 != null && $$2.e().test($$7)) {
            return $$3.C_() + $$6 + 1;
         }
      }

      return $$3.C_();
   }

   @Override
   public cpx a(int $$0, int $$1, cpn $$2, dkw $$3) {
      return new cpx($$2.C_(), this.d.f().stream().limit((long)$$2.D_()).map($$0x -> $$0x == null ? csm.a.n() : $$0x).toArray(dez[]::new));
   }

   @Override
   public void a(List<String> $$0, dkw $$1, gu $$2) {
   }

   @Override
   public void a(akr $$0, long $$1, dkw $$2, cql $$3, cqd $$4, dgv $$5, dke.a $$6) {
   }

   @Override
   public void a(akr $$0) {
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
