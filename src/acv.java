import com.mojang.brigadier.context.StringRange;
import com.mojang.brigadier.suggestion.Suggestion;
import com.mojang.brigadier.suggestion.Suggestions;
import java.util.List;
import java.util.Optional;

public record acv(int b, int c, int d, List<acv.a> e) implements zo<acd> {
   public static final zf<ws, acv> a = zf.a(zd.h, acv::e, zd.h, acv::f, zd.h, acv::g, acv.a.a.a(zd.a()), acv::h, acv::new);

   public acv(int $$0, Suggestions $$1) {
      this(
         $$0,
         $$1.getRange().getStart(),
         $$1.getRange().getLength(),
         $$1.getList().stream().map($$0x -> new acv.a($$0x.getText(), Optional.ofNullable($$0x.getTooltip()).map(xk::a))).toList()
      );
   }

   @Override
   public zq<acv> a() {
      return ags.r;
   }

   public void a(acd $$0) {
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

   public List<acv.a> h() {
      return this.e;
   }

   public static record a(String b, Optional<xh> c) {
      public static final zf<ws, acv.a> a = zf.a(zd.m, acv.a::a, xj.e, acv.a::b, acv.a::new);

      public String a() {
         return this.b;
      }

      public Optional<xh> b() {
         return this.c;
      }
   }
}
