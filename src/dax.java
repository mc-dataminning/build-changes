import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dax extends cyq {
   public static final MapCodec<dax> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dau.a.forGetter($$0x -> $$0x.f), u()).apply($$0, dax::new));
   private final czf f;

   @Override
   public MapCodec<dax> a() {
      return e;
   }

   protected dax(czf $$0, dmd.d $$1) {
      super($$1);
      this.f = $$0;
   }

   @Override
   protected void b(dme $$0, cwe $$1, ib $$2, dme $$3, boolean $$4) {
      this.a($$0, (cwf)$$1, $$2);
   }

   @Override
   protected void a(dme $$0, apa $$1, ib $$2, awt $$3) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this.f.o().a(d, Boolean.valueOf(false)).a(c, $$0.c(c)), 2);
      }
   }

   @Override
   protected dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      if ($$1.g() == $$0.c(c) && !$$0.a($$3, $$4)) {
         return czh.a.o();
      } else {
         if ($$0.c(d)) {
            $$3.a($$4, ehs.c, ehs.c.a($$3));
         }

         this.a($$0, $$3, $$4);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
