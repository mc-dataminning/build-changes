import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record dvg(Optional<cwl> d, Optional<cwl> e, Optional<cwl> f, Optional<cwl> g) {
   public static final dvg a = new dvg(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
   public static final Codec<dvg> b = mb.g.q().sizeLimitedListOf(4).xmap(dvg::new, dvg::a);
   public static final yn<wa, dvg> c = yl.a(mc.K).a(yl.c(4)).a(dvg::new, dvg::a);

   private dvg(List<cwl> $$0) {
      this(a($$0, 0), a($$0, 1), a($$0, 2), a($$0, 3));
   }

   public dvg(cwl $$0, cwl $$1, cwl $$2, cwl $$3) {
      this(List.of($$0, $$1, $$2, $$3));
   }

   private static Optional<cwl> a(List<cwl> $$0, int $$1) {
      if ($$1 >= $$0.size()) {
         return Optional.empty();
      } else {
         cwl $$2 = $$0.get($$1);
         return $$2 == cwt.rs ? Optional.empty() : Optional.of($$2);
      }
   }

   public tq a(tq $$0) {
      if (this.equals(a)) {
         return $$0;
      } else {
         $$0.a("sherds", (un)b.encodeStart(ue.a, this).getOrThrow());
         return $$0;
      }
   }

   public List<cwl> a() {
      return Stream.of(this.d, this.e, this.f, this.g).map($$0 -> $$0.orElse(cwt.rs)).toList();
   }

   public static dvg b(@Nullable tq $$0) {
      return $$0 != null && $$0.e("sherds") ? b.parse(ue.a, $$0.c("sherds")).result().orElse(a) : a;
   }

   public Optional<cwl> b() {
      return this.d;
   }

   public Optional<cwl> c() {
      return this.e;
   }

   public Optional<cwl> d() {
      return this.f;
   }

   public Optional<cwl> e() {
      return this.g;
   }
}
