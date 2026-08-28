import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class exa extends ewa {
   public static final MapCodec<exa> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(czt.d.fieldOf("pages").forGetter($$0x -> $$0x.b), evz.a(100).forGetter($$0x -> $$0x.c))).apply($$0, exa::new)
   );
   private final List<ash<String>> b;
   private final evz c;

   protected exa(List<exy> $$0, List<ash<String>> $$1, evz $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected cwm a(cwm $$0, eun $$1) {
      $$0.a(ku.S, czt.a, this::a);
      return $$0;
   }

   public czt a(czt $$0) {
      List<ash<String>> $$1 = this.c.a($$0.a(), this.b, 100);
      return $$0.b($$1);
   }

   @Override
   public ewc<exa> b() {
      return ewd.O;
   }
}
