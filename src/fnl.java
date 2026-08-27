import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.UUID;

public interface fnl extends fnk {
   static fnl.a a(GameProfile $$0, vr $$1, fnj $$2) {
      return new fnl.a($$0, $$1, $$2);
   }

   static fnl.b a(vb $$0, Instant $$1) {
      return new fnl.b($$0, $$1);
   }

   vb b();

   default vb c() {
      return this.b();
   }

   boolean a(UUID var1);

   public static record a(GameProfile c, vr d, fnj e) implements fnl {
      public static final Codec<fnl.a> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  atg.u.fieldOf("profile").forGetter(fnl.a::f), vr.a.forGetter(fnl.a::g), fnj.d.optionalFieldOf("trust_level", fnj.a).forGetter(fnl.a::h)
               )
               .apply($$0, fnl.a::new)
      );
      private static final DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);

      @Override
      public vb b() {
         if (!this.d.n().a()) {
            vb $$0 = this.d.n().b(this.d.b());
            return (vb)($$0 != null ? $$0 : vb.i());
         } else {
            return this.d.c();
         }
      }

      @Override
      public vb c() {
         vb $$0 = this.b();
         vb $$1 = this.i();
         return vb.a("gui.chatSelection.message.narrate", this.c.getName(), $$0, $$1);
      }

      public vb d() {
         vb $$0 = this.i();
         return vb.a("gui.chatSelection.heading", this.c.getName(), $$0);
      }

      private vb i() {
         LocalDateTime $$0 = LocalDateTime.ofInstant(this.d.d(), ZoneOffset.systemDefault());
         return vb.b($$0.format(f)).a(n.u, n.h);
      }

      @Override
      public boolean a(UUID $$0) {
         return this.d.a($$0);
      }

      public UUID e() {
         return this.c.getId();
      }

      @Override
      public fnk.a a() {
         return fnk.a.a;
      }

      public GameProfile f() {
         return this.c;
      }

      public vr g() {
         return this.d;
      }

      public fnj h() {
         return this.e;
      }
   }

   public static record b(vb c, Instant d) implements fnl {
      public static final Codec<fnl.b> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(vd.a.fieldOf("message").forGetter(fnl.b::d), atg.m.fieldOf("time_stamp").forGetter(fnl.b::e)).apply($$0, fnl.b::new)
      );

      @Override
      public vb b() {
         return this.c;
      }

      @Override
      public boolean a(UUID $$0) {
         return false;
      }

      @Override
      public fnk.a a() {
         return fnk.a.b;
      }

      public vb d() {
         return this.c;
      }

      public Instant e() {
         return this.d;
      }
   }
}
