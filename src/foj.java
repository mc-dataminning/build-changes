import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.UUID;

public interface foj extends foi {
   static foj.a a(GameProfile $$0, vv $$1, foh $$2) {
      return new foj.a($$0, $$1, $$2);
   }

   static foj.b a(vf $$0, Instant $$1) {
      return new foj.b($$0, $$1);
   }

   vf b();

   default vf c() {
      return this.b();
   }

   boolean a(UUID var1);

   public static record a(GameProfile c, vv d, foh e) implements foj {
      public static final Codec<foj.a> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  atv.u.fieldOf("profile").forGetter(foj.a::f), vv.a.forGetter(foj.a::g), foh.d.optionalFieldOf("trust_level", foh.a).forGetter(foj.a::h)
               )
               .apply($$0, foj.a::new)
      );
      private static final DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);

      @Override
      public vf b() {
         if (!this.d.n().a()) {
            vf $$0 = this.d.n().b(this.d.b());
            return (vf)($$0 != null ? $$0 : vf.i());
         } else {
            return this.d.c();
         }
      }

      @Override
      public vf c() {
         vf $$0 = this.b();
         vf $$1 = this.i();
         return vf.a("gui.chatSelection.message.narrate", this.c.getName(), $$0, $$1);
      }

      public vf d() {
         vf $$0 = this.i();
         return vf.a("gui.chatSelection.heading", this.c.getName(), $$0);
      }

      private vf i() {
         LocalDateTime $$0 = LocalDateTime.ofInstant(this.d.d(), ZoneOffset.systemDefault());
         return vf.b($$0.format(f)).a(n.u, n.h);
      }

      @Override
      public boolean a(UUID $$0) {
         return this.d.a($$0);
      }

      public UUID e() {
         return this.c.getId();
      }

      @Override
      public foi.a a() {
         return foi.a.a;
      }

      public GameProfile f() {
         return this.c;
      }

      public vv g() {
         return this.d;
      }

      public foh h() {
         return this.e;
      }
   }

   public static record b(vf c, Instant d) implements foj {
      public static final Codec<foj.b> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(vh.a.fieldOf("message").forGetter(foj.b::d), atv.m.fieldOf("time_stamp").forGetter(foj.b::e)).apply($$0, foj.b::new)
      );

      @Override
      public vf b() {
         return this.c;
      }

      @Override
      public boolean a(UUID $$0) {
         return false;
      }

      @Override
      public foi.a a() {
         return foi.a.b;
      }

      public vf d() {
         return this.c;
      }

      public Instant e() {
         return this.d;
      }
   }
}
