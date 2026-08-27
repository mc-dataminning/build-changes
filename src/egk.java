import com.google.common.collect.ImmutableSet;
import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class egk extends ego {
   public static final Codec<egk> a = RecordCodecBuilder.create($$0 -> a($$0).and(efc.b.e.fieldOf("entity").forGetter($$0x -> $$0x.b)).apply($$0, egk::new));
   private final efc.b b;

   public egk(List<eib> $$0, efc.b $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public egq b() {
      return egr.v;
   }

   @Override
   public Set<ehk<?>> a() {
      return ImmutableSet.of(this.b.a());
   }

   @Override
   public clo a(clo $$0, efc $$1) {
      if ($$0.a(clr.uf) && $$1.c(this.b.a()) instanceof cdz $$2) {
         GameProfile $$3 = $$2.fS();
         $$0.w().a("SkullOwner", ss.a(new sd(), $$3));
      }

      return $$0;
   }

   public static ego.a<?> a(efc.b $$0) {
      return a($$1 -> new egk($$1, $$0));
   }
}
