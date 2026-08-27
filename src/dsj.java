import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Stream;

public class dsj extends doy {
   public static final Codec<dsj> c = RecordCodecBuilder.create($$0 -> $$0.group(ebh.a.fieldOf("settings").forGetter(dsj::g)).apply($$0, $$0.stable(dsj::new)));
   private final ebh d;

   public dsj(ebh $$0) {
      super(new cyl($$0.d()), ac.b($$0::a));
      this.d = $$0;
   }

   @Override
   public doz a(in<edk> $$0, dtc $$1, long $$2) {
      Stream<il<edk>> $$3 = this.d.c().map(ip::a).orElseGet(() -> $$0.b().map($$0xx -> $$0xx));
      return doz.a($$1, $$2, this.b, $$3);
   }

   @Override
   protected Codec<? extends doy> a() {
      return c;
   }

   public ebh g() {
      return this.d;
   }

   @Override
   public void a(apm $$0, cxu $$1, dtc $$2, dox $$3) {
   }

   @Override
   public int a(cxd $$0) {
      return $$0.I_() + Math.min($$0.J_(), this.d.f().size());
   }

   @Override
   public CompletableFuture<dox> a(Executor $$0, dtq $$1, dtc $$2, cxu $$3, dox $$4) {
      List<dnb> $$5 = this.d.f();
      ib.a $$6 = new ib.a();
      dso $$7 = $$4.a(dso.a.c);
      dso $$8 = $$4.a(dso.a.a);

      for (int $$9 = 0; $$9 < Math.min($$4.J_(), $$5.size()); $$9++) {
         dnb $$10 = $$5.get($$9);
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
   public int a(int $$0, int $$1, dso.a $$2, cxd $$3, dtc $$4) {
      List<dnb> $$5 = this.d.f();

      for (int $$6 = Math.min($$5.size(), $$3.ak()) - 1; $$6 >= 0; $$6--) {
         dnb $$7 = $$5.get($$6);
         if ($$7 != null && $$2.e().test($$7)) {
            return $$3.I_() + $$6 + 1;
         }
      }

      return $$3.I_();
   }

   @Override
   public cxn a(int $$0, int $$1, cxd $$2, dtc $$3) {
      return new cxn($$2.I_(), this.d.f().stream().limit((long)$$2.J_()).map($$0x -> $$0x == null ? dae.a.o() : $$0x).toArray(dnb[]::new));
   }

   @Override
   public void a(List<String> $$0, dtc $$1, ib $$2) {
   }

   @Override
   public void a(apm $$0, long $$1, dtc $$2, cyc $$3, cxu $$4, dox $$5, dsk.a $$6) {
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
