import com.google.common.collect.ImmutableSet;
import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class egf extends egj {
   public static final Codec<egf> a = RecordCodecBuilder.create($$0 -> a($$0).and(eex.b.e.fieldOf("entity").forGetter($$0x -> $$0x.b)).apply($$0, egf::new));
   private final eex.b b;

   public egf(List<ehw> $$0, eex.b $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public egl b() {
      return egm.v;
   }

   @Override
   public Set<ehf<?>> a() {
      return ImmutableSet.of(this.b.a());
   }

   @Override
   public clj a(clj $$0, eex $$1) {
      if ($$0.a(clm.uf) && $$1.c(this.b.a()) instanceof cdu $$2) {
         GameProfile $$3 = $$2.fS();
         $$0.w().a("SkullOwner", so.a(new rz(), $$3));
      }

      return $$0;
   }

   public static egj.a<?> a(eex.b $$0) {
      return a($$1 -> new egf($$1, $$0));
   }
}
