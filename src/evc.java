import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class evc extends euy {
   public static final MapCodec<evc> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(etj.e.fieldOf("component").forGetter($$0x -> $$0x.b), evb.c.fieldOf("modifier").forGetter($$0x -> $$0x.c)))
            .apply($$0, evc::new)
   );
   private final eti<?> b;
   private final euz c;

   private evc(List<eww> $$0, eti<?> $$1, euz $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public eva<evc> b() {
      return evb.u;
   }

   @Override
   public cvs a(cvs $$0, etl $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         this.b.a($$0, $$1x -> this.c.apply($$1x, $$1));
         return $$0;
      }
   }

   @Override
   public void a(etr $$0) {
      super.a($$0);
      this.c.a($$0.a(".modifier"));
   }
}
