import com.google.common.collect.Lists;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class fmz extends fns implements fnm {
   @SerializedName("pingResults")
   public List<fnn> a = Lists.newArrayList();
   @SerializedName("worldIds")
   public List<Long> b = Lists.newArrayList();
}
