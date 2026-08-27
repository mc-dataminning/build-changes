import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Stream;

public class duv extends drf {
   public static final Codec<duv> c = RecordCodecBuilder.create($$0 -> $$0.group(edt.a.fieldOf("settings").forGetter(duv::g)).apply($$0, $$0.stable(duv::new)));
   private final edt d;

   public duv(edt $$0) {
      super(new daq($$0.d()), ac.b($$0::a));
      this.d = $$0;
   }

   @Override
   public drg a(ip<efw> $$0, dvo $$1, long $$2) {
      Stream<in<efw>> $$3 = this.d.c().map(ir::a).orElseGet(() -> $$0.b().map($$0xx -> $$0xx));
      return drg.a($$1, $$2, this.b, $$3);
   }

   @Override
   protected Codec<? extends drf> a() {
      return c;
   }

   public edt g() {
      return this.d;
   }

   @Override
   public void a(aqb $$0, czz $$1, dvo $$2, dre $$3) {
   }

   @Override
   public int a(czi $$0) {
      return $$0.I_() + Math.min($$0.J_(), this.d.f().size());
   }

   @Override
   public CompletableFuture<dre> a(Executor $$0, dwc $$1, dvo $$2, czz $$3, dre $$4) {
      List<dpi> $$5 = this.d.f();
      id.a $$6 = new id.a();
      dva $$7 = $$4.a(dva.a.c);
      dva $$8 = $$4.a(dva.a.a);

      for (int $$9 = 0; $$9 < Math.min($$4.J_(), $$5.size()); $$9++) {
         dpi $$10 = $$5.get($$9);
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
   public int a(int $$0, int $$1, dva.a $$2, czi $$3, dvo $$4) {
      List<dpi> $$5 = this.d.f();

      for (int $$6 = Math.min($$5.size(), $$3.al()) - 1; $$6 >= 0; $$6--) {
         dpi $$7 = $$5.get($$6);
         if ($$7 != null && $$2.e().test($$7)) {
            return $$3.I_() + $$6 + 1;
         }
      }

      return $$3.I_();
   }

   @Override
   public czs a(int $$0, int $$1, czi $$2, dvo $$3) {
      return new czs($$2.I_(), this.d.f().stream().limit((long)$$2.J_()).map($$0x -> $$0x == null ? dcj.a.n() : $$0x).toArray(dpi[]::new));
   }

   @Override
   public void a(List<String> $$0, dvo $$1, id $$2) {
   }

   @Override
   public void a(aqb $$0, long $$1, dvo $$2, dah $$3, czz $$4, dre $$5, duw.a $$6) {
   }

   @Override
   public void a(aqb $$0) {
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
