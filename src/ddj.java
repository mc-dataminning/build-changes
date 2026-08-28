import com.mojang.serialization.Codec;
import java.util.Optional;

public record ddj(czl<dix> c) {
   public static final Codec<ddj> a = czl.a(mi.bk, dix.c).xmap(ddj::new, ddj::a);
   public static final ze<wp, ddj> b = czl.a(mi.bk, dix.d).a(ddj::new, ddj::a);

   public ddj(jg<dix> $$0) {
      this(new czl<>($$0));
   }

   @Deprecated
   public ddj(alq<dix> $$0) {
      this(new czl<>($$0));
   }

   public Optional<jg<dix>> a(ji.a $$0) {
      return this.c.a($$0);
   }

   public czl<dix> a() {
      return this.c;
   }
}
