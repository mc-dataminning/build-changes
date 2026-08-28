import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class esc extends esh {
   public static final MapCodec<esc> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(cp.a.fieldOf("item_filter").forGetter($$0x -> $$0x.b), esk.c.fieldOf("modifier").forGetter($$0x -> $$0x.c)))
            .apply($$0, esc::new)
   );
   private final cp b;
   private final esi c;

   private esc(List<euf> $$0, cp $$1, esi $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public esj<esc> b() {
      return esk.v;
   }

   @Override
   public cuc a(cuc $$0, equ $$1) {
      return this.b.a($$0) ? this.c.apply($$0, $$1) : $$0;
   }

   @Override
   public void a(era $$0) {
      super.a($$0);
      this.c.a($$0.a(".modifier"));
   }
}
