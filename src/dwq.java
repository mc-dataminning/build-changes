import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Stream;

public class dwq extends dta {
   public static final MapCodec<dwq> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(efo.a.fieldOf("settings").forGetter(dwq::g)).apply($$0, $$0.stable(dwq::new))
   );
   private final efo d;

   public dwq(efo $$0) {
      super(new dcj($$0.d()), ac.b($$0::a));
      this.d = $$0;
   }

   @Override
   public dtb a(iz<ehr> $$0, dxj $$1, long $$2) {
      Stream<ix<ehr>> $$3 = this.d.c().map(jb::a).orElseGet(() -> $$0.b().map($$0xx -> $$0xx));
      return dtb.a($$1, $$2, this.b, $$3);
   }

   @Override
   protected MapCodec<? extends dta> a() {
      return c;
   }

   public efo g() {
      return this.d;
   }

   @Override
   public void a(aqu $$0, dbs $$1, dxj $$2, dsz $$3) {
   }

   @Override
   public int a(dbb $$0) {
      return $$0.I_() + Math.min($$0.J_(), this.d.f().size());
   }

   @Override
   public CompletableFuture<dsz> a(Executor $$0, dxx $$1, dxj $$2, dbs $$3, dsz $$4) {
      List<drd> $$5 = this.d.f();
      io.a $$6 = new io.a();
      dwv $$7 = $$4.a(dwv.a.c);
      dwv $$8 = $$4.a(dwv.a.a);

      for (int $$9 = 0; $$9 < Math.min($$4.J_(), $$5.size()); $$9++) {
         drd $$10 = $$5.get($$9);
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
   public int a(int $$0, int $$1, dwv.a $$2, dbb $$3, dxj $$4) {
      List<drd> $$5 = this.d.f();

      for (int $$6 = Math.min($$5.size(), $$3.al()) - 1; $$6 >= 0; $$6--) {
         drd $$7 = $$5.get($$6);
         if ($$7 != null && $$2.e().test($$7)) {
            return $$3.I_() + $$6 + 1;
         }
      }

      return $$3.I_();
   }

   @Override
   public dbl a(int $$0, int $$1, dbb $$2, dxj $$3) {
      return new dbl($$2.I_(), this.d.f().stream().limit((long)$$2.J_()).map($$0x -> $$0x == null ? dec.a.n() : $$0x).toArray(drd[]::new));
   }

   @Override
   public void a(List<String> $$0, dxj $$1, io $$2) {
   }

   @Override
   public void a(aqu $$0, long $$1, dxj $$2, dca $$3, dbs $$4, dsz $$5, dwr.a $$6) {
   }

   @Override
   public void a(aqu $$0) {
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
