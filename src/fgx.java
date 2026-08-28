import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Collection;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public abstract class fgx {
   public boolean a(@Nullable fgx $$0) {
      return $$0 == null ? false : this == $$0;
   }

   public abstract String c();

   public abstract xo d(xa var1);

   public abstract boolean j();

   public abstract boolean i();

   public abstract fgx.b k();

   public abstract o o();

   public abstract Collection<String> h();

   public abstract fgx.b l();

   public abstract fgx.a m();

   public static enum a implements bam {
      a("always", 0),
      b("never", 1),
      c("pushOtherTeams", 2),
      d("pushOwnTeam", 3);

      public static final Codec<fgx.a> e = bam.a(fgx.a::values);
      private static final IntFunction<fgx.a> i = aye.a($$0 -> $$0.h, values(), aye.a.a);
      public static final yy<ByteBuf, fgx.a> f = yw.a(i, $$0 -> $$0.h);
      public final String g;
      public final int h;

      private a(final String $$0, final int $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public xa a() {
         return xa.c("team.collision." + this.g);
      }

      @Override
      public String c() {
         return this.g;
      }
   }

   public static enum b implements bam {
      a("always", 0),
      b("never", 1),
      c("hideForOtherTeams", 2),
      d("hideForOwnTeam", 3);

      public static final Codec<fgx.b> e = bam.a(fgx.b::values);
      private static final IntFunction<fgx.b> i = aye.a($$0 -> $$0.h, values(), aye.a.a);
      public static final yy<ByteBuf, fgx.b> f = yw.a(i, $$0 -> $$0.h);
      public final String g;
      public final int h;

      private b(final String $$0, final int $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public xa a() {
         return xa.c("team.visibility." + this.g);
      }

      @Override
      public String c() {
         return this.g;
      }
   }
}
