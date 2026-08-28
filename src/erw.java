import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class erw extends esb {
   public static final MapCodec<erw> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(cp.a.fieldOf("item_filter").forGetter($$0x -> $$0x.b), ese.c.fieldOf("modifier").forGetter($$0x -> $$0x.c)))
            .apply($$0, erw::new)
   );
   private final cp b;
   private final esc c;

   private erw(List<etz> $$0, cp $$1, esc $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public esd<erw> b() {
      return ese.v;
   }

   @Override
   public cua a(cua $$0, eqo $$1) {
      return this.b.a($$0) ? this.c.apply($$0, $$1) : $$0;
   }

   @Override
   public void a(equ $$0) {
      super.a($$0);
      this.c.a($$0.a(".modifier"));
   }
}
