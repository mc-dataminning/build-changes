import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ezc extends eyy {
   public static final MapCodec<ezc> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(exj.e.fieldOf("component").forGetter($$0x -> $$0x.b), ezb.c.fieldOf("modifier").forGetter($$0x -> $$0x.c)))
            .apply($$0, ezc::new)
   );
   private final exi<?> b;
   private final eyz c;

   private ezc(List<fau> $$0, exi<?> $$1, eyz $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public eza<ezc> b() {
      return ezb.u;
   }

   @Override
   public cxy a(cxy $$0, exl $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         this.b.a($$0, $$1x -> this.c.apply($$1x, $$1));
         return $$0;
      }
   }

   @Override
   public void a(exr $$0) {
      super.a($$0);
      this.c.a($$0.a(".modifier"));
   }
}
