import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Stream;

public class dmm extends djf {
   public static final Codec<dmm> c = RecordCodecBuilder.create($$0 -> $$0.group(dvk.a.fieldOf("settings").forGetter(dmm::g)).apply($$0, $$0.stable(dmm::new)));
   private final dvk d;

   public dmm(dvk $$0) {
      super(new ctj($$0.d()), ac.b($$0::a));
      this.d = $$0;
   }

   @Override
   public djg a(id<dxn> $$0, dnf $$1, long $$2) {
      Stream<ib<dxn>> $$3 = this.d.c().map(ig::a).orElseGet(() -> $$0.b().map($$0xx -> $$0xx));
      return djg.a($$1, $$2, this.b, $$3);
   }

   @Override
   protected Codec<? extends djf> a() {
      return c;
   }

   public dvk g() {
      return this.d;
   }

   @Override
   public void a(aml $$0, css $$1, dnf $$2, dje $$3) {
   }

   @Override
   public int a(csc $$0) {
      return $$0.I_() + Math.min($$0.J_(), this.d.f().size());
   }

   @Override
   public CompletableFuture<dje> a(Executor $$0, dnt $$1, dnf $$2, css $$3, dje $$4) {
      List<dhi> $$5 = this.d.f();
      ht.a $$6 = new ht.a();
      dmr $$7 = $$4.a(dmr.a.c);
      dmr $$8 = $$4.a(dmr.a.a);

      for (int $$9 = 0; $$9 < Math.min($$4.J_(), $$5.size()); $$9++) {
         dhi $$10 = $$5.get($$9);
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
   public int a(int $$0, int $$1, dmr.a $$2, csc $$3, dnf $$4) {
      List<dhi> $$5 = this.d.f();

      for (int $$6 = Math.min($$5.size(), $$3.ak()) - 1; $$6 >= 0; $$6--) {
         dhi $$7 = $$5.get($$6);
         if ($$7 != null && $$2.e().test($$7)) {
            return $$3.I_() + $$6 + 1;
         }
      }

      return $$3.I_();
   }

   @Override
   public csm a(int $$0, int $$1, csc $$2, dnf $$3) {
      return new csm($$2.I_(), this.d.f().stream().limit((long)$$2.J_()).map($$0x -> $$0x == null ? cvc.a.o() : $$0x).toArray(dhi[]::new));
   }

   @Override
   public void a(List<String> $$0, dnf $$1, ht $$2) {
   }

   @Override
   public void a(aml $$0, long $$1, dnf $$2, cta $$3, css $$4, dje $$5, dmn.a $$6) {
   }

   @Override
   public void a(aml $$0) {
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
