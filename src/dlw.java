import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dlw(List<dlw.b> d) {
   public static final dlw a = new dlw(List.of());
   public static final Codec<dlw> b = dlw.b.a.listOf().xmap(dlw::new, dlw::b);
   public static final ye<vr, dlw> c = dlw.b.b.a(yc.a()).a(dlw::new, dlw::b);

   public dlw a(cqc $$0) {
      return new dlw.a().a(dlx.a, $$0).a(this).a();
   }

   public dlw a() {
      return new dlw(List.copyOf(this.d.subList(0, this.d.size() - 1)));
   }

   public List<dlw.b> b() {
      return this.d;
   }

   public static class a {
      private final Builder<dlw.b> a = ImmutableList.builder();

      public dlw.a a(ajs<dlv> $$0, cqc $$1) {
         return this.a(kr.am.g($$0), $$1);
      }

      public dlw.a a(il<dlv> $$0, cqc $$1) {
         return this.a(new dlw.b($$0, $$1));
      }

      public dlw.a a(dlw.b $$0) {
         this.a.add($$0);
         return this;
      }

      public dlw.a a(dlw $$0) {
         this.a.addAll($$0.d);
         return this;
      }

      public dlw a() {
         return new dlw(this.a.build());
      }
   }

   public static record b(il<dlv> c, cqc d) {
      public static final Codec<dlw.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(kr.am.r().fieldOf("pattern").forGetter(dlw.b::a), cqc.q.fieldOf("color").forGetter(dlw.b::b)).apply($$0, dlw.b::new)
      );
      public static final ye<vr, dlw.b> b = ye.a(yc.b(ks.d), dlw.b::a, cqc.r, dlw.b::b, dlw.b::new);

      public il<dlv> a() {
         return this.c;
      }

      public cqc b() {
         return this.d;
      }
   }
}
