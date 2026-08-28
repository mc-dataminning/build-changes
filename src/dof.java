import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dof extends dlx {
   public static final MapCodec<dof> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group(doc.a.forGetter($$0x -> $$0x.f), t()).apply($$0, dof::new));
   private final dmm f;

   @Override
   public MapCodec<dof> a() {
      return e;
   }

   protected dof(dmm $$0, ean.d $$1) {
      super($$1);
      this.f = $$0;
   }

   @Override
   protected void a(eao $$0, djh $$1, iv $$2, eao $$3, boolean $$4) {
      this.a($$0, $$1, $$1, $$1.A, $$2);
   }

   @Override
   protected void a(eao $$0, arq $$1, iv $$2, azv $$3) {
      if (!d($$0, $$1, $$2)) {
         $$1.a($$2, this.f.m().b(b, Boolean.valueOf(false)).b(d, $$0.c(d)), 2);
      }
   }

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      if ($$4.g() == $$0.c(d) && !$$0.a($$1, $$3)) {
         return dmo.a.m();
      } else {
         if ($$0.c(b)) {
            $$2.a($$3, eww.c, eww.c.a($$1));
         }

         this.a($$0, $$1, $$2, $$7, $$3);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
