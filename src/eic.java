import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eic extends ehq {
   public static final Codec<eic> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(ejz.a.fieldOf("count").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, eic::new)
   );
   private final ejy b;
   private final boolean c;

   private eic(List<ejd> $$0, ejy $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public ehs b() {
      return eht.c;
   }

   @Override
   public Set<eim<?>> a() {
      return this.b.a();
   }

   @Override
   public cmh a(cmh $$0, ege $$1) {
      int $$2 = this.c ? $$0.L() : 0;
      $$0.f(aty.a($$2 + this.b.a($$1), 0, $$0.g()));
      return $$0;
   }

   public static ehq.a<?> a(ejy $$0) {
      return a($$1 -> new eic($$1, $$0, false));
   }

   public static ehq.a<?> a(ejy $$0, boolean $$1) {
      return a($$2 -> new eic($$2, $$0, $$1));
   }
}
