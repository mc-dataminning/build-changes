import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.UUID;

public interface fjo extends fjn {
   static fjo.a a(GameProfile $$0, ua $$1, fjm $$2) {
      return new fjo.a($$0, $$1, $$2);
   }

   static fjo.b a(tl $$0, Instant $$1) {
      return new fjo.b($$0, $$1);
   }

   tl b();

   default tl c() {
      return this.b();
   }

   boolean a(UUID var1);

   public static record a(GameProfile c, ua d, fjm e) implements fjo {
      public static final Codec<fjo.a> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  arf.u.fieldOf("profile").forGetter(fjo.a::f), ua.a.forGetter(fjo.a::g), fjm.d.optionalFieldOf("trust_level", fjm.a).forGetter(fjo.a::h)
               )
               .apply($$0, fjo.a::new)
      );
      private static final DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);

      @Override
      public tl b() {
         if (!this.d.n().a()) {
            tl $$0 = this.d.n().b(this.d.b());
            return (tl)($$0 != null ? $$0 : tl.h());
         } else {
            return this.d.c();
         }
      }

      @Override
      public tl c() {
         tl $$0 = this.b();
         tl $$1 = this.i();
         return tl.a("gui.chatSelection.message.narrate", this.c.getName(), $$0, $$1);
      }

      public tl d() {
         tl $$0 = this.i();
         return tl.a("gui.chatSelection.heading", this.c.getName(), $$0);
      }

      private tl i() {
         LocalDateTime $$0 = LocalDateTime.ofInstant(this.d.d(), ZoneOffset.systemDefault());
         return tl.b($$0.format(f)).a(n.u, n.h);
      }

      @Override
      public boolean a(UUID $$0) {
         return this.d.a($$0);
      }

      public UUID e() {
         return this.c.getId();
      }

      @Override
      public fjn.a a() {
         return fjn.a.a;
      }

      public GameProfile f() {
         return this.c;
      }

      public ua g() {
         return this.d;
      }

      public fjm h() {
         return this.e;
      }
   }

   public static record b(tl c, Instant d) implements fjo {
      public static final Codec<fjo.b> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(arf.b.fieldOf("message").forGetter(fjo.b::d), arf.m.fieldOf("time_stamp").forGetter(fjo.b::e)).apply($$0, fjo.b::new)
      );

      @Override
      public tl b() {
         return this.c;
      }

      @Override
      public boolean a(UUID $$0) {
         return false;
      }

      @Override
      public fjn.a a() {
         return fjn.a.b;
      }

      public tl d() {
         return this.c;
      }

      public Instant e() {
         return this.d;
      }
   }
}
