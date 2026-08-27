import com.google.common.collect.ImmutableSet;
import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eid extends eih {
   public static final Codec<eid> a = RecordCodecBuilder.create($$0 -> a($$0).and(egv.b.e.fieldOf("entity").forGetter($$0x -> $$0x.b)).apply($$0, eid::new));
   private final egv.b b;

   public eid(List<eju> $$0, egv.b $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eij b() {
      return eik.v;
   }

   @Override
   public Set<ejd<?>> a() {
      return ImmutableSet.of(this.b.a());
   }

   @Override
   public cmx a(cmx $$0, egv $$1) {
      if ($$0.a(cna.ug) && $$1.c(this.b.a()) instanceof cfh $$2) {
         GameProfile $$3 = $$2.fR();
         $$0.w().a("SkullOwner", tc.a(new sn(), $$3));
      }

      return $$0;
   }

   public static eih.a<?> a(egv.b $$0) {
      return a($$1 -> new eid($$1, $$0));
   }
}
