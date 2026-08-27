import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Stream;

public class dki extends dhb {
   public static final Codec<dki> c = RecordCodecBuilder.create($$0 -> $$0.group(dtg.a.fieldOf("settings").forGetter(dki::g)).apply($$0, $$0.stable(dki::new)));
   private final dtg d;

   public dki(dtg $$0) {
      super(new cqz($$0.d()), ac.b($$0::a));
      this.d = $$0;
   }

   @Override
   public dhc a(hi<dvj> $$0, dlb $$1, long $$2) {
      Stream<hg<dvj>> $$3 = this.d.c().map(hk::a).orElseGet(() -> $$0.b().map($$0xx -> $$0xx));
      return dhc.a($$1, $$2, this.b, $$3);
   }

   @Override
   protected Codec<? extends dhb> a() {
      return c;
   }

   public dtg g() {
      return this.d;
   }

   @Override
   public void a(aku $$0, cqi $$1, dlb $$2, dha $$3) {
   }

   @Override
   public int a(cps $$0) {
      return $$0.C_() + Math.min($$0.D_(), this.d.f().size());
   }

   @Override
   public CompletableFuture<dha> a(Executor $$0, dlp $$1, dlb $$2, cqi $$3, dha $$4) {
      List<dfe> $$5 = this.d.f();
      gw.a $$6 = new gw.a();
      dkn $$7 = $$4.a(dkn.a.c);
      dkn $$8 = $$4.a(dkn.a.a);

      for (int $$9 = 0; $$9 < Math.min($$4.D_(), $$5.size()); $$9++) {
         dfe $$10 = $$5.get($$9);
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
   public int a(int $$0, int $$1, dkn.a $$2, cps $$3, dlb $$4) {
      List<dfe> $$5 = this.d.f();

      for (int $$6 = Math.min($$5.size(), $$3.aj()) - 1; $$6 >= 0; $$6--) {
         dfe $$7 = $$5.get($$6);
         if ($$7 != null && $$2.e().test($$7)) {
            return $$3.C_() + $$6 + 1;
         }
      }

      return $$3.C_();
   }

   @Override
   public cqc a(int $$0, int $$1, cps $$2, dlb $$3) {
      return new cqc($$2.C_(), this.d.f().stream().limit((long)$$2.D_()).map($$0x -> $$0x == null ? csr.a.n() : $$0x).toArray(dfe[]::new));
   }

   @Override
   public void a(List<String> $$0, dlb $$1, gw $$2) {
   }

   @Override
   public void a(aku $$0, long $$1, dlb $$2, cqq $$3, cqi $$4, dha $$5, dkj.a $$6) {
   }

   @Override
   public void a(aku $$0) {
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
