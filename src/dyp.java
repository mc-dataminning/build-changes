import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Stream;

public class dyp extends duz {
   public static final Codec<dyp> c = RecordCodecBuilder.create($$0 -> $$0.group(ehv.a.fieldOf("settings").forGetter(dyp::g)).apply($$0, $$0.stable(dyp::new)));
   private final ehv d;

   public dyp(ehv $$0) {
      super(new ddk($$0.d()), ad.b($$0::a));
      this.d = $$0;
   }

   @Override
   public dva a(jc<ejz> $$0, dzi $$1, long $$2) {
      Stream<ja<ejz>> $$3 = this.d.c().map(je::a).orElseGet(() -> $$0.b().map($$0xx -> $$0xx));
      return dva.a($$1, $$2, this.b, $$3);
   }

   @Override
   protected Codec<? extends duz> a() {
      return c;
   }

   public ehv g() {
      return this.d;
   }

   @Override
   public void a(ara $$0, dct $$1, dzi $$2, duy $$3) {
   }

   @Override
   public int a(dcc $$0) {
      return $$0.J_() + Math.min($$0.K_(), this.d.f().size());
   }

   @Override
   public CompletableFuture<duy> a(Executor $$0, dzw $$1, dzi $$2, dct $$3, duy $$4) {
      List<dtc> $$5 = this.d.f();
      ir.a $$6 = new ir.a();
      dyu $$7 = $$4.a(dyu.a.c);
      dyu $$8 = $$4.a(dyu.a.a);

      for (int $$9 = 0; $$9 < Math.min($$4.K_(), $$5.size()); $$9++) {
         dtc $$10 = $$5.get($$9);
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
   public int a(int $$0, int $$1, dyu.a $$2, dcc $$3, dzi $$4) {
      List<dtc> $$5 = this.d.f();

      for (int $$6 = Math.min($$5.size(), $$3.am()) - 1; $$6 >= 0; $$6--) {
         dtc $$7 = $$5.get($$6);
         if ($$7 != null && $$2.e().test($$7)) {
            return $$3.J_() + $$6 + 1;
         }
      }

      return $$3.J_();
   }

   @Override
   public dcm a(int $$0, int $$1, dcc $$2, dzi $$3) {
      return new dcm($$2.J_(), this.d.f().stream().limit((long)$$2.K_()).map($$0x -> $$0x == null ? dfe.a.n() : $$0x).toArray(dtc[]::new));
   }

   @Override
   public void a(List<String> $$0, dzi $$1, ir $$2) {
   }

   @Override
   public void a(ara $$0, long $$1, dzi $$2, ddb $$3, dct $$4, duy $$5, dyq.a $$6) {
   }

   @Override
   public void a(ara $$0) {
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
