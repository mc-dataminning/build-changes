import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Stream;

public class drl extends dob {
   public static final Codec<drl> c = RecordCodecBuilder.create($$0 -> $$0.group(eaj.a.fieldOf("settings").forGetter(drl::g)).apply($$0, $$0.stable(drl::new)));
   private final eaj d;

   public drl(eaj $$0) {
      super(new cxo($$0.d()), ac.b($$0::a));
      this.d = $$0;
   }

   @Override
   public doc a(in<ecm> $$0, dse $$1, long $$2) {
      Stream<il<ecm>> $$3 = this.d.c().map(ip::a).orElseGet(() -> $$0.b().map($$0xx -> $$0xx));
      return doc.a($$1, $$2, this.b, $$3);
   }

   @Override
   protected Codec<? extends dob> a() {
      return c;
   }

   public eaj g() {
      return this.d;
   }

   @Override
   public void a(aph $$0, cwx $$1, dse $$2, doa $$3) {
   }

   @Override
   public int a(cwg $$0) {
      return $$0.J_() + Math.min($$0.K_(), this.d.f().size());
   }

   @Override
   public CompletableFuture<doa> a(Executor $$0, dss $$1, dse $$2, cwx $$3, doa $$4) {
      List<dme> $$5 = this.d.f();
      ib.a $$6 = new ib.a();
      drq $$7 = $$4.a(drq.a.c);
      drq $$8 = $$4.a(drq.a.a);

      for (int $$9 = 0; $$9 < Math.min($$4.K_(), $$5.size()); $$9++) {
         dme $$10 = $$5.get($$9);
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
   public int a(int $$0, int $$1, drq.a $$2, cwg $$3, dse $$4) {
      List<dme> $$5 = this.d.f();

      for (int $$6 = Math.min($$5.size(), $$3.ak()) - 1; $$6 >= 0; $$6--) {
         dme $$7 = $$5.get($$6);
         if ($$7 != null && $$2.e().test($$7)) {
            return $$3.J_() + $$6 + 1;
         }
      }

      return $$3.J_();
   }

   @Override
   public cwq a(int $$0, int $$1, cwg $$2, dse $$3) {
      return new cwq($$2.J_(), this.d.f().stream().limit((long)$$2.K_()).map($$0x -> $$0x == null ? czh.a.o() : $$0x).toArray(dme[]::new));
   }

   @Override
   public void a(List<String> $$0, dse $$1, ib $$2) {
   }

   @Override
   public void a(aph $$0, long $$1, dse $$2, cxf $$3, cwx $$4, doa $$5, drm.a $$6) {
   }

   @Override
   public void a(aph $$0) {
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
