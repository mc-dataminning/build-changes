import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class evy extends euy {
   public static final MapCodec<evy> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(czd.d.fieldOf("pages").forGetter($$0x -> $$0x.b), eux.a(100).forGetter($$0x -> $$0x.c))).apply($$0, evy::new)
   );
   private final List<asa<String>> b;
   private final eux c;

   protected evy(List<eww> $$0, List<asa<String>> $$1, eux $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected cvs a(cvs $$0, etl $$1) {
      $$0.a(ks.N, czd.a, this::a);
      return $$0;
   }

   public czd a(czd $$0) {
      List<asa<String>> $$1 = this.c.a($$0.a(), this.b, 100);
      return $$0.b($$1);
   }

   @Override
   public eva<evy> b() {
      return evb.O;
   }
}
