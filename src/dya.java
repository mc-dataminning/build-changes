import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class dya extends duh {
   public static final MapCodec<dya> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(egz.a.fieldOf("settings").forGetter(dya::h)).apply($$0, $$0.stable(dya::new))
   );
   private final egz d;

   public dya(egz $$0) {
      super(new ddq($$0.d()), ac.b($$0::a));
      this.d = $$0;
   }

   @Override
   public dui a(jl<ejc> $$0, dyt $$1, long $$2) {
      Stream<jj<ejc>> $$3 = this.d.c().map(jn::a).orElseGet(() -> $$0.b().map($$0xx -> $$0xx));
      return dui.a($$1, $$2, this.b, $$3);
   }

   @Override
   protected MapCodec<? extends duh> b() {
      return c;
   }

   public egz h() {
      return this.d;
   }

   @Override
   public void a(aqt $$0, dcz $$1, dyt $$2, dug $$3) {
   }

   @Override
   public int a(dch $$0) {
      return $$0.I_() + Math.min($$0.J_(), this.d.f().size());
   }

   @Override
   public CompletableFuture<dug> a(dzh $$0, dyt $$1, dcz $$2, dug $$3) {
      List<dsk> $$4 = this.d.f();
      ja.a $$5 = new ja.a();
      dyf $$6 = $$3.a(dyf.a.c);
      dyf $$7 = $$3.a(dyf.a.a);

      for (int $$8 = 0; $$8 < Math.min($$3.J_(), $$4.size()); $$8++) {
         dsk $$9 = $$4.get($$8);
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
   public int a(int $$0, int $$1, dyf.a $$2, dch $$3, dyt $$4) {
      List<dsk> $$5 = this.d.f();

      for (int $$6 = Math.min($$5.size(), $$3.am()) - 1; $$6 >= 0; $$6--) {
         dsk $$7 = $$5.get($$6);
         if ($$7 != null && $$2.e().test($$7)) {
            return $$3.I_() + $$6 + 1;
         }
      }

      return $$3.I_();
   }

   @Override
   public dcr a(int $$0, int $$1, dch $$2, dyt $$3) {
      return new dcr($$2.I_(), this.d.f().stream().limit((long)$$2.J_()).map($$0x -> $$0x == null ? dfj.a.o() : $$0x).toArray(dsk[]::new));
   }

   @Override
   public void a(List<String> $$0, dyt $$1, ja $$2) {
   }

   @Override
   public void a(aqt $$0, long $$1, dyt $$2, ddh $$3, dcz $$4, dug $$5, dyb.a $$6) {
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
