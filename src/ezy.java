import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ezy extends eyy {
   public static final MapCodec<ezy> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(dbd.d.fieldOf("pages").forGetter($$0x -> $$0x.b), eyx.a(100).forGetter($$0x -> $$0x.c))).apply($$0, ezy::new)
   );
   private final List<asf<String>> b;
   private final eyx c;

   protected ezy(List<fau> $$0, List<asf<String>> $$1, eyx $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected cxy a(cxy $$0, exl $$1) {
      $$0.a(kx.U, dbd.a, this::a);
      return $$0;
   }

   public dbd a(dbd $$0) {
      List<asf<String>> $$1 = this.c.a($$0.a(), this.b, 100);
      return $$0.b($$1);
   }

   @Override
   public eza<ezy> b() {
      return ezb.O;
   }
}
