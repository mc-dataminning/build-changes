import com.google.common.collect.ImmutableSet;
import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eme extends emi {
   public static final Codec<eme> a = RecordCodecBuilder.create($$0 -> a($$0).and(ekw.b.e.fieldOf("entity").forGetter($$0x -> $$0x.b)).apply($$0, eme::new));
   private final ekw.b b;

   public eme(List<env> $$0, ekw.b $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public emk b() {
      return eml.v;
   }

   @Override
   public Set<ene<?>> a() {
      return ImmutableSet.of(this.b.a());
   }

   @Override
   public cqm a(cqm $$0, ekw $$1) {
      if ($$0.a(cqp.ul) && $$1.c(this.b.a()) instanceof ciu $$2) {
         GameProfile $$3 = $$2.fY();
         $$0.x().a("SkullOwner", tp.a(new ta(), $$3));
      }

      return $$0;
   }

   public static emi.a<?> a(ekw.b $$0) {
      return a($$1 -> new eme($$1, $$0));
   }
}
