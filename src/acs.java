import com.mojang.brigadier.context.StringRange;
import com.mojang.brigadier.suggestion.Suggestion;
import com.mojang.brigadier.suggestion.Suggestions;
import java.util.List;
import java.util.Optional;

public record acs(int b, int c, int d, List<acs.a> e) implements zl<aca> {
   public static final zc<wp, acs> a = zc.a(za.h, acs::e, za.h, acs::f, za.h, acs::g, acs.a.a.a(za.a()), acs::h, acs::new);

   public acs(int $$0, Suggestions $$1) {
      this(
         $$0,
         $$1.getRange().getStart(),
         $$1.getRange().getLength(),
         $$1.getList().stream().map($$0x -> new acs.a($$0x.getText(), Optional.ofNullable($$0x.getTooltip()).map(xh::a))).toList()
      );
   }

   @Override
   public zn<acs> a() {
      return agp.r;
   }

   public void a(aca $$0) {
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

   public List<acs.a> h() {
      return this.e;
   }

   public static record a(String b, Optional<xe> c) {
      public static final zc<wp, acs.a> a = zc.a(za.m, acs.a::a, xg.e, acs.a::b, acs.a::new);

      public String a() {
         return this.b;
      }

      public Optional<xe> b() {
         return this.c;
      }
   }
}
