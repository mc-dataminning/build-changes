import com.mojang.brigadier.context.StringRange;
import com.mojang.brigadier.suggestion.Suggestion;
import com.mojang.brigadier.suggestion.Suggestions;
import java.util.List;
import java.util.Optional;

public record adj(int b, int c, int d, List<adj.a> e) implements aac<acr> {
   public static final zt<xg, adj> a = zt.a(zr.h, adj::e, zr.h, adj::f, zr.h, adj::g, adj.a.a.a(zr.a()), adj::h, adj::new);

   public adj(int $$0, Suggestions $$1) {
      this(
         $$0,
         $$1.getRange().getStart(),
         $$1.getRange().getLength(),
         $$1.getList().stream().map($$0x -> new adj.a($$0x.getText(), Optional.ofNullable($$0x.getTooltip()).map(xy::a))).toList()
      );
   }

   @Override
   public aae<adj> a() {
      return ahk.r;
   }

   public void a(acr $$0) {
      $$0.a(this);
   }

   public Suggestions b() {
      StringRange $$0 = StringRange.between(this.c, this.c + this.d);
      return new Suggestions($$0, this.e.stream().map($$1 -> new Suggestion($$0, $$1.a(), $$1.b().orElse(null))).toList());
   }

   public int e() {
      return this.b;
   }

   public int f() {
      return this.c;
   }

   public int g() {
      return this.d;
   }

   public List<adj.a> h() {
      return this.e;
   }

   public static record a(String b, Optional<xv> c) {
      public static final zt<xg, adj.a> a = zt.a(zr.o, adj.a::a, xx.e, adj.a::b, adj.a::new);

      public String a() {
         return this.b;
      }

      public Optional<xv> b() {
         return this.c;
      }
   }
}
