import com.google.gson.annotations.SerializedName;
import java.util.Set;

public class eoz extends epg implements epa {
   @SerializedName("seed")
   private final String a;
   @SerializedName("worldTemplateId")
   private final long b;
   @SerializedName("levelType")
   private final int c;
   @SerializedName("generateStructures")
   private final boolean d;
   @SerializedName("experiments")
   private final Set<String> e;

   public eoz(String $$0, long $$1, int $$2, boolean $$3, Set<String> $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }
}
