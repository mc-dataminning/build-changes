import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Stream;

public class dkc extends dgv {
   public static final Codec<dkc> c = RecordCodecBuilder.create($$0 -> $$0.group(dta.a.fieldOf("settings").forGetter(dkc::g)).apply($$0, $$0.stable(dkc::new)));
   private final dta d;

   public dkc(dta $$0) {
      super(new cqt($$0.d()), ac.b($$0::a));
      this.d = $$0;
   }

   @Override
   public dgw a(hh<dvd> $$0, dkv $$1, long $$2) {
      Stream<hf<dvd>> $$3 = this.d.c().map(hj::a).orElseGet(() -> $$0.b().map($$0xx -> $$0xx));
      return dgw.a($$1, $$2, this.b, $$3);
   }

   @Override
   protected Codec<? extends dgv> a() {
      return c;
   }

   public dta g() {
      return this.d;
   }

   @Override
   public void a(akp $$0, cqc $$1, dkv $$2, dgu $$3) {
   }

   @Override
   public int a(cpm $$0) {
      return $$0.C_() + Math.min($$0.D_(), this.d.f().size());
   }

   @Override
   public CompletableFuture<dgu> a(Executor $$0, dlj $$1, dkv $$2, cqc $$3, dgu $$4) {
      List<dey> $$5 = this.d.f();
      gv.a $$6 = new gv.a();
      dkh $$7 = $$4.a(dkh.a.c);
      dkh $$8 = $$4.a(dkh.a.a);

      for (int $$9 = 0; $$9 < Math.min($$4.D_(), $$5.size()); $$9++) {
         dey $$10 = $$5.get($$9);
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
   public int a(int $$0, int $$1, dkh.a $$2, cpm $$3, dkv $$4) {
      List<dey> $$5 = this.d.f();

      for (int $$6 = Math.min($$5.size(), $$3.aj()) - 1; $$6 >= 0; $$6--) {
         dey $$7 = $$5.get($$6);
         if ($$7 != null && $$2.e().test($$7)) {
            return $$3.C_() + $$6 + 1;
         }
      }

      return $$3.C_();
   }

   @Override
   public cpw a(int $$0, int $$1, cpm $$2, dkv $$3) {
      return new cpw($$2.C_(), this.d.f().stream().limit((long)$$2.D_()).map($$0x -> $$0x == null ? csl.a.n() : $$0x).toArray(dey[]::new));
   }

   @Override
   public void a(List<String> $$0, dkv $$1, gv $$2) {
   }

   @Override
   public void a(akp $$0, long $$1, dkv $$2, cqk $$3, cqc $$4, dgu $$5, dkd.a $$6) {
   }

   @Override
   public void a(akp $$0) {
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
