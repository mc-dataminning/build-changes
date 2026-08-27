import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class dwg extends dwt {
   public static final Codec<dwg> a = dms.a.c.fieldOf("step").xmap(dwg::new, $$0 -> $$0.c).codec();
   private final dms.a c;

   private dwg(dms.a $$0) {
      this.c = $$0;
   }

   public static dwg a(dms.a $$0) {
      return new dwg($$0);
   }

   @Override
   public Stream<hx> a_(dwr $$0, atw $$1, hx $$2) {
      crm $$3 = new crm($$2);
      return $$0.a($$3, this.c).a($$3);
   }

   @Override
   public dwu<?> b() {
      return dwu.o;
   }
}
