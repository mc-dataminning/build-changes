import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class dyb extends dui {
   public static final MapCodec<dyb> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eha.a.fieldOf("settings").forGetter(dyb::h)).apply($$0, $$0.stable(dyb::new))
   );
   private final eha d;

   public dyb(eha $$0) {
      super(new ddr($$0.d()), ac.b($$0::a));
      this.d = $$0;
   }

   @Override
   public duj a(jl<ejd> $$0, dyu $$1, long $$2) {
      Stream<jj<ejd>> $$3 = this.d.c().map(jn::a).orElseGet(() -> $$0.b().map($$0xx -> $$0xx));
      return duj.a($$1, $$2, this.b, $$3);
   }

   @Override
   protected MapCodec<? extends dui> b() {
      return c;
   }

   public eha h() {
      return this.d;
   }

   @Override
   public void a(aqt $$0, dda $$1, dyu $$2, duh $$3) {
   }

   @Override
   public int a(dci $$0) {
      return $$0.I_() + Math.min($$0.J_(), this.d.f().size());
   }

   @Override
   public CompletableFuture<duh> a(dzi $$0, dyu $$1, dda $$2, duh $$3) {
      List<dsl> $$4 = this.d.f();
      ja.a $$5 = new ja.a();
      dyg $$6 = $$3.a(dyg.a.c);
      dyg $$7 = $$3.a(dyg.a.a);

      for (int $$8 = 0; $$8 < Math.min($$3.J_(), $$4.size()); $$8++) {
         dsl $$9 = $$4.get($$8);
         if ($$9 != null) {
            int $$10 = $$3.I_() + $$8;

            for (int $$11 = 0; $$11 < 16; $$11++) {
               for (int $$12 = 0; $$12 < 16; $$12++) {
                  $$3.a($$5.d($$11, $$10, $$12), $$9, false);
                  $$6.a($$11, $$10, $$12, $$9);
                  $$7.a($$11, $$10, $$12, $$9);
               }
            }
         }
      }

      return CompletableFuture.completedFuture($$3);
   }

   @Override
   public int a(int $$0, int $$1, dyg.a $$2, dci $$3, dyu $$4) {
      List<dsl> $$5 = this.d.f();

      for (int $$6 = Math.min($$5.size(), $$3.am()) - 1; $$6 >= 0; $$6--) {
         dsl $$7 = $$5.get($$6);
         if ($$7 != null && $$2.e().test($$7)) {
            return $$3.I_() + $$6 + 1;
         }
      }

      return $$3.I_();
   }

   @Override
   public dcs a(int $$0, int $$1, dci $$2, dyu $$3) {
      return new dcs($$2.I_(), this.d.f().stream().limit((long)$$2.J_()).map($$0x -> $$0x == null ? dfk.a.o() : $$0x).toArray(dsl[]::new));
   }

   @Override
   public void a(List<String> $$0, dyu $$1, ja $$2) {
   }

   @Override
   public void a(aqt $$0, long $$1, dyu $$2, ddi $$3, dda $$4, duh $$5, dyc.a $$6) {
   }

   @Override
   public void a(aqt $$0) {
   }

   @Override
   public int g() {
      return 0;
   }

   @Override
   public int e() {
      return 384;
   }

   @Override
   public int f() {
      return -63;
   }
}
