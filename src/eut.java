import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eut extends euy {
   public static final MapCodec<eut> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(cs.a.fieldOf("item_filter").forGetter($$0x -> $$0x.b), evb.c.fieldOf("modifier").forGetter($$0x -> $$0x.c)))
            .apply($$0, eut::new)
   );
   private final cs b;
   private final euz c;

   private eut(List<eww> $$0, cs $$1, euz $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public eva<eut> b() {
      return evb.v;
   }

   @Override
   public cvs a(cvs $$0, etl $$1) {
      return this.b.a($$0) ? this.c.apply($$0, $$1) : $$0;
   }

   @Override
   public void a(etr $$0) {
      super.a($$0);
      this.c.a($$0.a(".modifier"));
   }
}
