import com.mojang.brigadier.context.StringRange;
import com.mojang.brigadier.suggestion.Suggestion;
import com.mojang.brigadier.suggestion.Suggestions;
import java.util.List;
import java.util.Optional;

public record aci(int b, int c, int d, List<aci.a> e) implements zc<abr> {
   public static final yt<wg, aci> a = yt.a(yr.h, aci::e, yr.h, aci::f, yr.h, aci::g, aci.a.a.a(yr.a()), aci::h, aci::new);

   public aci(int $$0, Suggestions $$1) {
      this(
         $$0,
         $$1.getRange().getStart(),
         $$1.getRange().getLength(),
         $$1.getList().stream().map($$0x -> new aci.a($$0x.getText(), Optional.ofNullable($$0x.getTooltip()).map(wy::a))).toList()
      );
   }

   @Override
   public ze<aci> a() {
      return agk.q;
   }

   public void a(abr $$0) {
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

   public List<aci.a> h() {
      return this.e;
   }

   public static record a(String b, Optional<wv> c) {
      public static final yt<wg, aci.a> a = yt.a(yr.o, aci.a::a, wx.e, aci.a::b, aci.a::new);

      public String a() {
         return this.b;
      }

      public Optional<wv> b() {
         return this.c;
      }
   }
}
