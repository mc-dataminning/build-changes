import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class dwb extends dwo {
   public static final Codec<dwb> a = dmn.a.c.fieldOf("step").xmap(dwb::new, $$0 -> $$0.c).codec();
   private final dmn.a c;

   private dwb(dmn.a $$0) {
      this.c = $$0;
   }

   public static dwb a(dmn.a $$0) {
      return new dwb($$0);
   }

   @Override
   public Stream<ht> a_(dwm $$0, ats $$1, ht $$2) {
      crh $$3 = new crh($$2);
      return $$0.a($$3, this.c).a($$3);
   }

   @Override
   public dwp<?> b() {
      return dwp.o;
   }
}
