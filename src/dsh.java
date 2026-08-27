import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Stream;

public class dsh extends dow {
   public static final Codec<dsh> c = RecordCodecBuilder.create($$0 -> $$0.group(ebf.a.fieldOf("settings").forGetter(dsh::g)).apply($$0, $$0.stable(dsh::new)));
   private final ebf d;

   public dsh(ebf $$0) {
      super(new cyj($$0.d()), ac.b($$0::a));
      this.d = $$0;
   }

   @Override
   public dox a(in<edi> $$0, dta $$1, long $$2) {
      Stream<il<edi>> $$3 = this.d.c().map(ip::a).orElseGet(() -> $$0.b().map($$0xx -> $$0xx));
      return dox.a($$1, $$2, this.b, $$3);
   }

   @Override
   protected Codec<? extends dow> a() {
      return c;
   }

   public ebf g() {
      return this.d;
   }

   @Override
   public void a(apm $$0, cxs $$1, dta $$2, dov $$3) {
   }

   @Override
   public int a(cxb $$0) {
      return $$0.I_() + Math.min($$0.J_(), this.d.f().size());
   }

   @Override
   public CompletableFuture<dov> a(Executor $$0, dto $$1, dta $$2, cxs $$3, dov $$4) {
      List<dmz> $$5 = this.d.f();
      ib.a $$6 = new ib.a();
      dsm $$7 = $$4.a(dsm.a.c);
      dsm $$8 = $$4.a(dsm.a.a);

      for (int $$9 = 0; $$9 < Math.min($$4.J_(), $$5.size()); $$9++) {
         dmz $$10 = $$5.get($$9);
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
   public int a(int $$0, int $$1, dsm.a $$2, cxb $$3, dta $$4) {
      List<dmz> $$5 = this.d.f();

      for (int $$6 = Math.min($$5.size(), $$3.ak()) - 1; $$6 >= 0; $$6--) {
         dmz $$7 = $$5.get($$6);
         if ($$7 != null && $$2.e().test($$7)) {
            return $$3.I_() + $$6 + 1;
         }
      }

      return $$3.I_();
   }

   @Override
   public cxl a(int $$0, int $$1, cxb $$2, dta $$3) {
      return new cxl($$2.I_(), this.d.f().stream().limit((long)$$2.J_()).map($$0x -> $$0x == null ? dac.a.o() : $$0x).toArray(dmz[]::new));
   }

   @Override
   public void a(List<String> $$0, dta $$1, ib $$2) {
   }

   @Override
   public void a(apm $$0, long $$1, dta $$2, cya $$3, cxs $$4, dov $$5, dsi.a $$6) {
   }

   @Override
   public void a(apm $$0) {
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
