import com.google.common.collect.ImmutableSet;
import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eeq extends eeu {
   public static final Codec<eeq> a = RecordCodecBuilder.create($$0 -> a($$0).and(edi.b.e.fieldOf("entity").forGetter($$0x -> $$0x.b)).apply($$0, eeq::new));
   private final edi.b b;

   public eeq(List<egh> $$0, edi.b $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eew b() {
      return eex.v;
   }

   @Override
   public Set<efq<?>> a() {
      return ImmutableSet.of(this.b.a());
   }

   @Override
   public ckj a(ckj $$0, edi $$1) {
      if ($$0.a(ckm.tt) && $$1.c(this.b.a()) instanceof ccx $$2) {
         GameProfile $$3 = $$2.fR();
         $$0.w().a("SkullOwner", sg.a(new rt(), $$3));
      }

      return $$0;
   }

   public static eeu.a<?> a(edi.b $$0) {
      return a($$1 -> new eeq($$1, $$0));
   }
}
